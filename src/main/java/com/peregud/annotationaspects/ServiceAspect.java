package com.peregud.annotationaspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ServiceAspect {

    @Before("execution(* com.peregud.annotationaspects.SenderService.send(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("Method " + joinPoint.getSignature().getName() + " will be called now");
        System.out.println("******");
    }

    @After("execution(* com.peregud.annotationaspects.SenderService.send(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("******");
        System.out.println("Method " + joinPoint.getSignature().getName() + " was called");
    }

    @Around(
            value = "execution(* com.peregud.annotationaspects.SenderService.send(..))")
    public Object executionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("******");
        long start = System.nanoTime();
        Object proceed = joinPoint.proceed();
        long executionTime = System.nanoTime() - start;
        System.out.println(joinPoint.getSignature().getName() + " executed in " + executionTime + " nanoseconds");
        return proceed;
    }

    @AfterThrowing(
            pointcut = "execution(* com.peregud.annotationaspects.SenderService.sendException(..))",
            throwing = "error")
    public void afterThrowing(JoinPoint joinPoint, Throwable error) {
        System.out.println("******");
        System.out.println("Throwing exception");
        System.out.println("Method : " + joinPoint.getSignature().getName());
        System.out.println("Exception : " + error);
    }
}
