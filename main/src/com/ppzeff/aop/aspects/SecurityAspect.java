package com.ppzeff.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class SecurityAspect {
    @Before("com.ppzeff.aop.aspects.MyPointCuts.allGetMethodFromUnilibrary()")
    public void beforeSecurityAdvice() {
        System.out.println("beforeSecurityAdvice: провека прав доступа на получение книги/журнала");
    }
}
