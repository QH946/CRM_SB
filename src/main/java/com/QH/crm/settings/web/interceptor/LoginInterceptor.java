package com.QH.crm.settings.web.interceptor;

import com.QH.crm.commons.constants.Constants;
import com.QH.crm.settings.model.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.settings.web.interceptor
 * @date 2022/8/8 12:28
 */

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //如果用户没有登录成功，则跳转到登录页面
        HttpSession session = httpServletRequest.getSession();
        User user= (User) session.getAttribute(Constants.SESSION_USER);
        if (user == null) {
            //重定向时，getContextPath获取项目名称(url必须加项目的名称)
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath());
            return false;
        }
        return true;
    }

    @Override
    //Controller方法处理完之后，DispatcherServlet进行视图的渲染之前，也就是说在这个方法中你可以对ModelAndView进行操作
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(httpServletRequest, httpServletResponse, handler, modelAndView);
    }
    //DispatcherServlet进行视图的渲染之后
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception e) throws Exception {
        HandlerInterceptor.super.afterCompletion(httpServletRequest, httpServletResponse, handler, e);
    }
}
