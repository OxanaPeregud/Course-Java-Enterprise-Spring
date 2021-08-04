package com.peregud.xmlaspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class ServiceAspect {

    public void before(JoinPoint joinPoint) {
        System.out.println("Method " + joinPoint.getSignature().getName() + " will be called now");
        System.out.println("******");
    }

    public void after(JoinPoint joinPoint) {
        System.out.println("******");
        System.out.println("Method " + joinPoint.getSignature().getName() + " was called");
    }

    public Object executionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();
        Object proceed = joinPoint.proceed();
        long executionTime = System.nanoTime() - start;
        System.out.println(joinPoint.getSignature().getName() + " executed in " + executionTime + " nanoseconds");
        return proceed;
    }

    public void afterThrowing(JoinPoint joinPoint) {
        System.out.println("******");
        System.out.println("Throwing exception");
        System.out.println("Method : " + joinPoint.getSignature().getName());
    }
}
