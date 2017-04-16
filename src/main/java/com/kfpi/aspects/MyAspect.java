package com.kfpi.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    public static boolean beforeInitSimpleBeanCalled = false;

    @Before("initialization(com.kfpi.aspects.SimpleBean.new(..))")
    public void beforeInitSimpleBean(JoinPoint jp) {
        System.out.println("Before init");
        beforeInitSimpleBeanCalled = true;
    }

}
