package com.example.exercice_gestion_bibliotheque.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {

    @Pointcut("@annotation(com.example.exercice_gestion_bibliotheque.annotation.PerformanceAnnotation)")
    public void performancePointcut() {
    }

    @Around("performancePointcut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        long durationTime = endTime - startTime;
        System.out.println("Duration time: " + durationTime + " ms");
    }
}
