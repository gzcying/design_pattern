package com.chengzi.designpatterns.proxy._5_springAdvisor;

import com.chengzi.designpatterns.proxy.Greeting;
import com.chengzi.designpatterns.proxy.GreetingImpl;
import com.chengzi.designpatterns.proxy._4_springAOP.methodAdvice.GreetingAroundAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;

/**
 * Spring AOP Advisor（切面测试），切面（增强+切点，请看readme文件）
 * 只拦截 say 开头的方法
 * @see "https://my.oschina.net/huangyong/blog/161402"
 */
public class TestByProgram {

    //编程式测试（不能自动代理，即：每个类的切面和代理都需要拷贝差不多的代码）
    public static void main(String[] args) {
        GreetingAroundAdvice aroundAdvice = new GreetingAroundAdvice();
        String pattern = "com.chengzi.designpatterns.proxy.GreetingImpl.say.*";
        RegexpMethodPointcutAdvisor advisor = new RegexpMethodPointcutAdvisor(pattern,aroundAdvice);

        ProxyFactory proxyFactory = new ProxyFactory();     // 创建代理工厂
        proxyFactory.setProxyTargetClass(true);
        proxyFactory.setTarget(new GreetingImpl());         // 射入目标类对象
        proxyFactory.addAdvisor(advisor);                   //

        Greeting greeting = (Greeting) proxyFactory.getProxy();
        greeting.sayHello("by TestByProgram advisor: jackson");
        System.out.println("\n ===wave方法没有拦截===");
        greeting.wave(2);
    }

}
