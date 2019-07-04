package com.chengzi.designpatterns.structural_Patterns.proxy._4_springAOP.methodAdvice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 方法的前置增强
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("before :add by methodBeforeAdvice");
    }
}
