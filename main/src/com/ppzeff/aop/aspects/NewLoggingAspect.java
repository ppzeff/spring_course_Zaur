package com.ppzeff.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String com.ppzeff.aop.UniLibrary.returnBook())")
    public Object aroundReturnBookAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookAdvice: в библеотеку пытаються вернуть книгу");


        Object targetMethodResult = null;
        long begin = 0;
        long end = 0;
        begin = System.currentTimeMillis();
        try {

            targetMethodResult = proceedingJoinPoint.proceed();

        } catch (Exception e) {
            System.out.println("aroundReturnBookAdvice: было поймано исключение " + e);
//            targetMethodResult = "Неизвестное название книги";
            throw e;
        }
        end = System.currentTimeMillis();
        System.out.println("aroundReturnBookAdvice: в библеотеку возвращают книгу");

        System.out.println("aroundReturnBookAdvice: в библеотеку пытаються вернули книгу");
        System.out.println(end - begin + " millis");

        return targetMethodResult;
    }
}
