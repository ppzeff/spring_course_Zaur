package com.ppzeff.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(* com.ppzeff.aop.UniLibrary.get*())")
    public void allGetMethodFromUnilibrary() {
    }
}
