package com.ppzeff.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class LoggingAspect{
    @Before("com.ppzeff.aop.aspects.MyPointCuts.allGetMethodFromUnilibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: попытка получить книгу/журнал");

    }

}