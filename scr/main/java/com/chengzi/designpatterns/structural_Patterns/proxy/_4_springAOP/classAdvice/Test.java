package com.chengzi.designpatterns.structural_Patterns.proxy._4_springAOP.classAdvice;

import com.chengzi.designpatterns.structural_Patterns.proxy.Greeting;
import com.chengzi.designpatterns.structural_Patterns.proxy.GreetingImpl;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @see "https://my.oschina.net/huangyong/blog/161338"
 * 引入增强（在类上加方法）
 */
public class Test {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();     // 创建代理工厂
        //这个一定要为true(否则报错：cannot be cast to com.chengzi.designpatterns.structural_Patterns.proxy.Greeting)
        // 它表明是否代理目标类，默认为 false，也就是代理接口了，此时 Spring 就用 JDK 动态代理。
        // 如果为 true，那么 Spring 就用 CGLib 动态代理
        proxyFactory.setProxyTargetClass(true);
        proxyFactory.setTarget(new GreetingImpl());         // 射入目标类对象
        proxyFactory.addAdvice(new GreetingIntroAdvice()); // 添加前置增强

        Greeting greeting = (Greeting) proxyFactory.getProxy();
        greeting.sayHello("by Introduction advice: LIly");
        greeting.wave(2);

        Apology apology = (Apology) greeting;
        apology.saySorry("so sorry to jack");
    }
}
