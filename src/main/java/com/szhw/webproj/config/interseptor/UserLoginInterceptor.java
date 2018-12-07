package com.szhw.webproj.config.interseptor;

import com.szhw.webproj.common.GlobalConstant;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author HJF
 * @date 2018/12/6 13:11
 */
@Component
public class UserLoginInterceptor implements HandlerInterceptor, GlobalConstant {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        if (null == session.getAttribute(SESSION_ATTR_KEY)) {
            response.sendRedirect("/");
            return false;
        }
        return true;
    }
}
