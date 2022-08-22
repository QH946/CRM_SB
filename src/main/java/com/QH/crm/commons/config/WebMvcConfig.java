package com.QH.crm.commons.config;

import com.QH.crm.settings.web.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.commons.Config
 * @date 2022/8/22 12:12
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor)
                // 拦截规则 ，拦截哪些路径
                .addPathPatterns("/settings/**", "/workbench/**")
                // 哪些路径不拦截
                .excludePathPatterns("/settings/qx/user/toLogin.do", "/settings/qx/user/login.do"
                        , "/settings/qx/user/toRegister.do", "/settings/qx/user/register.do", "/image/**"
                        , "/jquery/**", "/settings/error/404page.jsp","/static/**");
    }

}
