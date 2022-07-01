package com.zmh.demo.config;


import com.zmh.demo.pojo.Log;
import com.zmh.demo.service.LogService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@Configuration
@Aspect
@Slf4j
public class AOPconfig {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private LogService logService;

    @Pointcut("execution(* com.zmh.demo.controller.bishe_user.*.*(..))"+"||"
            +"execution(* com.zmh.demo.controller.bishe_admin.*.*(..))"+"||"
             +"execution(* com.zmh.demo.controller.guanlicenter.*.*(..))"+"||"
             +"execution(* com.zmh.demo.controller.bishe_user_in.*.*(..))")
    public void pointCut(){

    }

    @Before(value = "pointCut()")
    public void before(JoinPoint joinPoint){
        log.info("进入方法"+joinPoint.getSignature().getName());
    }

    @After(value = "pointCut()")
    public void after(JoinPoint joinPoint){
        int status = 0;
        String event = null;
        Date times = null;
        String time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            times=simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String message=joinPoint.getSignature().getName();


        if(request.getAttribute("status")!=null){
            status= (int) request.getAttribute("status");
            if(status==1){
                event="common";
            }else {
                event="error";
            }
        }

        logService.logInit(new Log(status,message,event,times));

    }

}
