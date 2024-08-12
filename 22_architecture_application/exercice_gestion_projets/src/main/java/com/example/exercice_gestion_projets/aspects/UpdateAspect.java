package com.example.exercice_gestion_projets.aspects;

import com.example.exercice_gestion_projets.util.TasksProgress;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class UpdateAspect {

    private TasksProgress tasksProgress;

    @Pointcut("@annotation(com.example.exercice_gestion_projets.annotation.UpdateAspectAnnotation)")
    public void updateAspect() {

    }

    @Before("updateAspect()")
    public void beforeUpdate(JoinPoint joinPoint) {
        String updateAspect = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Update aspect : " + updateAspect);
        Arrays.stream(args).forEach(arg -> {
            TasksProgress progression = tasksProgress;
        });
    }

    @AfterReturning(value = "updateAspect()", returning = "update")
    public void afterUpdate(JoinPoint joinPoint, Object update) {
        if (update == TasksProgress.IN_PROGRESS) {
            System.out.println("In progress");
        }else if(update == TasksProgress.DONE){
            System.out.println("Done");
        }
    }

    @AfterThrowing(value = "updateAspect()", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        System.out.println("Exception : " + exception.getMessage());
    }

}
