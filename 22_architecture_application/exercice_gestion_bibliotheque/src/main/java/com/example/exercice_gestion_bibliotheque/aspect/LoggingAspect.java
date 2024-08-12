package com.example.exercice_gestion_bibliotheque.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {



    @Before("execution(*  com.example.exercice_gestion_bibliotheque.service.*.*(..))")
    public void logIn() {
        System.out.println("Before execution");
    }

    @After("execution(*  com.example.exercice_gestion_bibliotheque.service.*.*(..))")
    public void logOut() {
        System.out.println("After execution");
    }
}
