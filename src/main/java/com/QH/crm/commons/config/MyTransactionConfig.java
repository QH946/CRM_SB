package com.QH.crm.commons.config;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.interceptor.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.commons.Config
 * @date 2022/8/22 11:17
 */
@Aspect
@Configuration
public class MyTransactionConfig {

    /**
     * 配置方法过期时间，默认-1,永不超时
     */
    private final static int TX_METHOD_TIME_OUT = 10;

    /**
     * 全局事务位置配置 在哪些地方需要进行事务处理
     * 配置切入点表达式
     */
    private static final String POINTCUT_EXPRESSION = "execution(* com.QH.crm..service.*.*(..))";

    @Autowired
    private PlatformTransactionManager platformTransactionManager;


    @Bean
    public TransactionInterceptor txadvice() {

        /*只读事物、不做更新删除等*/
        /*事务管理规则*/
        RuleBasedTransactionAttribute readOnlyRule = new RuleBasedTransactionAttribute();
        /*设置当前事务是否为只读事务，true为只读*/
        readOnlyRule.setReadOnly(true);
        /* transactiondefinition 定义事务的隔离级别；
         *如果当前存在事务，则加入该事务；如果当前没有事务，则以非事务的方式继续运行。*/
        readOnlyRule.setPropagationBehavior(TransactionDefinition.PROPAGATION_SUPPORTS);

        /*增删改事务规则*/
        RuleBasedTransactionAttribute requireRule = new RuleBasedTransactionAttribute();
        /*抛出异常后执行切点回滚 建议自定义异常*/
        requireRule.setRollbackRules(Collections.singletonList(new RollbackRuleAttribute(Exception.class)));
        /*PROPAGATION_REQUIRED:事务隔离性为1，若当前存在事务，则加入该事务；如果当前没有事务，则创建一个新的事务。这是默认值。 */
        requireRule.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        /*设置事务失效时间，超过10秒*/
        requireRule.setTimeout(TX_METHOD_TIME_OUT);

        /** 配置事务管理规则
         nameMap声明具备需要管理事务的方法名.
         这里使用addTransactionalMethod  使用setNameMap
         */
        Map<String, TransactionAttribute> nameMap = new HashMap<>();
        nameMap.put("add*", requireRule);
        nameMap.put("save*", requireRule);
        nameMap.put("insert*", requireRule);
        nameMap.put("update*", requireRule);
        nameMap.put("delete*", requireRule);
        nameMap.put("remove*", requireRule);

        /*进行批量操作时*/
        nameMap.put("batch*", requireRule);
        nameMap.put("get*", readOnlyRule);
        nameMap.put("query*", readOnlyRule);
        nameMap.put("find*", readOnlyRule);
        nameMap.put("select*", readOnlyRule);
        nameMap.put("count*", readOnlyRule);

        NameMatchTransactionAttributeSource source = new NameMatchTransactionAttributeSource();
        source.setNameMap(nameMap);

        TransactionInterceptor transactionInterceptor = new TransactionInterceptor(platformTransactionManager, source);

        return transactionInterceptor;
    }

    /**
     * 设置切面=切点pointcut+通知TxAdvice
     * @return
     */
    @Bean
    public Advisor txAdviceAdvisor() {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression(POINTCUT_EXPRESSION);
        return new DefaultPointcutAdvisor(pointcut, txadvice());
    }
}
