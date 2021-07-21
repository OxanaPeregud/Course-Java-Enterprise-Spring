package com.peregud.dependencyinjection.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class NotifyingAspect {

    @Before("execution(* com.peregud.dependencyinjection.domain.Discount.apply(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("Holiday is coming");
        System.out.println("Method : " + joinPoint.getSignature().getName());
        System.out.println("******");
    }

    @After("execution(* com.peregud.dependencyinjection.domain.Discount.apply(..))")
    public void after() {
        System.out.println("******");
        System.out.println("Holiday is over");
    }

    @AfterReturning(
            pointcut = "execution(* com.peregud.dependencyinjection.domain.Discount.calculateDiscount(..))",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("******");
        System.out.println("Discount has been calculated");
        System.out.println("Method : " + joinPoint.getSignature().getName());
        System.out.println("Method returned value is : " + result);
        System.out.println("******");
    }

    @Around(
            value = "execution(* com.peregud.dependencyinjection.domain.Discount.calculateDiscount(..))")
    public Object executionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("******");
        long start = System.nanoTime();
        Object proceed = joinPoint.proceed();
        long executionTime = System.nanoTime() - start;
        System.out.println(joinPoint.getSignature().getName() + " executed in " + executionTime + " nanoseconds");
        return proceed;
    }

    @AfterThrowing(
            pointcut = "execution(* com.peregud.dependencyinjection.domain.Discount.calculationError(..))",
            throwing = "error")
    public void afterThrowing(JoinPoint joinPoint, Throwable error) {
        System.out.println("Throwing exception");
        System.out.println("Method : " + joinPoint.getSignature().getName());
        System.out.println("Exception : " + error);
        System.out.println("******");
    }
}
