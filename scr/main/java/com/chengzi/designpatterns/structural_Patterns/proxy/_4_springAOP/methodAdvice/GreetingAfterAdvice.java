package com.chengzi.designpatterns.structural_Patterns.proxy._4_springAOP.methodAdvice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

//方法的后置增强
public class GreetingAfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object result, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("After： add by afterReturningAdvice");
    }
}