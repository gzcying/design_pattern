package com.chengzi.designpatterns.proxy._4_springAOP.methodAdvice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

//方法的异常增强
public class GreetingThrowAdvice implements ThrowsAdvice {

    public void afterThrowing(Method method, Object[] args, Object target, Exception e) {
        System.out.println("---------- Throw Exception ----------");
        System.out.println("Target Class: " + target.getClass().getName());
        System.out.println("Method Name: " + method.getName());
        System.out.println("Exception Message: " + e.getMessage());
        System.out.println("-------------------------------------");
    }
}