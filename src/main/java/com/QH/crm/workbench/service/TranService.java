package com.QH.crm.workbench.service;

import com.QH.crm.workbench.model.FunnelVO;
import com.QH.crm.workbench.model.Tran;

import java.util.List;
import java.util.Map;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.service
 * @date 2022/8/15 12:29
 */;

public interface TranService {
    List<Tran> queryTransactionByConditionForPage(Map<String, Object> map);

    int queryCountOfTransactionByCondition(Map<String, Object> map);

    void saveCreateTransaction(Tran tran);

    Tran queryTransactionById(String id);

    void saveEditTransaction(Tran tran);

    void deleteTranByIds(String[] ids);

    Tran queryTranForDetailById(String id);

    List<FunnelVO> queryCountOfTranGroupByStage();
}
