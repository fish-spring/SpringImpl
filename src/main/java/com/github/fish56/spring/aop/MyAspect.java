package com.github.fish56.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void logBefore(){
        System.out.println("begin log");
    }
    public void logAfter(){
        System.out.println("end log");
    }
    public void logAroundButStop(){
        System.out.println("log around");
    }
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("log around begin");
        joinPoint.proceed();
        System.out.println("log around stop");
    }
    public void afterThrowing(){
        System.out.println("Just throw an exception");
    }
}
