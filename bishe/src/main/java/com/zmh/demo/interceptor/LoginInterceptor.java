package com.zmh.demo.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    private final static Logger logger= LoggerFactory.getLogger(LoggerFactory.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String num= (String) request.getSession().getAttribute("key");
        if(num!=null){
            logger.info("进入审查，当前用户为"+num);
            return true;
        }else {
            response.sendRedirect("/index");
            logger.info("拦截成功!");
            return false;
        }
    }
}
