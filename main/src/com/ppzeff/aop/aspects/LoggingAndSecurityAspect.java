package com.ppzeff.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* com.ppzeff.aop.UniLibrary.get*())")
    private void allGetMethodFromUnilibrary() {
    }


    @Pointcut("execution(* com.ppzeff.aop.UniLibrary.return*())")
    private void allReturnMethodFromUnilibrary() {
    }

    @Pointcut("allGetMethodFromUnilibrary() || allReturnMethodFromUnilibrary()")
    private void allGetAndReturnLoggingMethodFromUnilibrary() {
    }

    @Before("allGetMethodFromUnilibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethodFromUnilibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #2");
    }

    @Before("allGetAndReturnLoggingMethodFromUnilibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #3");
    }

//    @Before("execution(public void getBook(com.ppzeff.aop.Book))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }
}
