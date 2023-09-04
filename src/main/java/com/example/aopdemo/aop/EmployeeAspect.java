package com.example.aopdemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class EmployeeAspect {

    //This is Point cut expression
    @Before(value = "execution(* com.example.aopdemo.controller.EmployeeController.*(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("Request to " +joinPoint.getSignature() +" STARTED at "+ new Date());
    }

    @After(value = "execution(* com.example.aopdemo.controller.EmployeeController.*(..))")
    public void afterAdvice(JoinPoint joinPoint){
        System.out.println("Request to " +joinPoint.getSignature() +" ENDED at "+ new Date());
    }

    @Before(value = "execution(* com.example.aopdemo.service.EmployeeService.*(..))")
    public void beforeServiceAdvice(JoinPoint joinPoint){
        System.out.println("Request to " +joinPoint.getSignature() +" STARTED at "+ new Date());
    }

    @After(value = "execution(* com.example.aopdemo.service.EmployeeService.*(..))")
    public void afterServiceAdvice(JoinPoint joinPoint){
        System.out.println("Request to " +joinPoint.getSignature() +" ENDED at "+ new Date());
    }

}
