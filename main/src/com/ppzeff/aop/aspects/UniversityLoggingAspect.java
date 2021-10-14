package com.ppzeff.aop.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* com.ppzeff.aop.University.getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents ");
    }

    @AfterReturning("execution(* com.ppzeff.aop.University.getStudents())")
    public void afterReturningGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов после работы " +
                "метода getStudents ");
    }
}
