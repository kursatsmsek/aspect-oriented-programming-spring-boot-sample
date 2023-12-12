package com.kursatdev.springbootaopsample.aspect;

import com.kursatdev.springbootaopsample.model.SampleData;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SampleAspect {

    @Before("execution(* com.kursatdev.springbootaopsample.service.*.*(..))")
    public void beforeGetMessage(JoinPoint joinPoint) {
        SampleData sampleData = (SampleData) joinPoint.getArgs()[0];
        if (!sampleData.getToken().isBlank()) {
            // TODO token control can be add here
            System.out.println("before get message running...");
        } else {
            System.err.println("token cannot be null");
            System.exit(0);
        }
    }

    @After("execution(* com.kursatdev.springbootaopsample.service.*.*(..))")
    public void afterGetMessage(JoinPoint joinPoint)  {
        SampleData sampleData = (SampleData) joinPoint.getArgs()[0];
        System.out.println("Successfully process for: " + sampleData.getName());
        System.out.println("after get message running...");
    }
}
