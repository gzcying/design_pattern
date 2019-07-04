package com.chengzi.designpatterns.structural_Patterns.proxy._4_springAOP.methodAdvice;

import com.chengzi.designpatterns.structural_Patterns.proxy.Greeting;
import com.chengzi.designpatterns.structural_Patterns.proxy.GreetingImpl;
import org.springframework.aop.framework.ProxyFactory;

/**
 * 方法增强-对类中所有的方法都生效
 * @see "https://my.oschina.net/huangyong/blog/161338"
 */
public class Test {

    //前置与后置增强
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();     // 创建代理工厂
        proxyFactory.setTarget(new GreetingImpl());         // 射入目标类对象
        proxyFactory.addAdvice(new GreetingBeforeAdvice()); // 添加前置增强
        proxyFactory.addAdvice(new GreetingAfterAdvice());  // 添加后置增强 

        Greeting greeting = (Greeting) proxyFactory.getProxy(); // 从代理工厂中获取代理
        greeting.sayHello("Jack");                              // 调用代理的方法
        greeting.wave(1);                              // 调用代理的方法
    }

    //环绕增强：相当于前置与后置增强的结合
    @org.junit.Test
    public void testAroundAdvice() {
        ProxyFactory proxyFactory = new ProxyFactory();     // 创建代理工厂
        proxyFactory.setTarget(new GreetingImpl());
        proxyFactory.addAdvice(new GreetingAroundAdvice());

        Greeting greeting = (Greeting) proxyFactory.getProxy();
        greeting.sayHello("say by around : john");
        greeting.wave(2);
    }

    //异常增强
    @org.junit.Test
    public void testExceptionAdvice() {
        ProxyFactory proxyFactory = new ProxyFactory();     // 创建代理工厂
        proxyFactory.setTarget(new GreetException());
        proxyFactory.addAdvice(new GreetingThrowAdvice());

        Greeting greeting = (Greeting) proxyFactory.getProxy();
        //greeting.sayHello("say by except : william");
        greeting.wave(3);
    }

    class GreetException implements Greeting {

        @Override
        public void sayHello(String name) {
            throw new RuntimeException("sayHello 手动抛出异常");
        }

        @Override
        public void wave(int times) {
            throw new RuntimeException("wave 手动抛出异常");

        }
    }


}