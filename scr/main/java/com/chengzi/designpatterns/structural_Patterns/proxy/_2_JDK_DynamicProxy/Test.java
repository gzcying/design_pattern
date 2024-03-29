package com.chengzi.designpatterns.structural_Patterns.proxy._2_JDK_DynamicProxy;

import com.chengzi.designpatterns.structural_Patterns.proxy.Greeting;
import com.chengzi.designpatterns.structural_Patterns.proxy.GreetingImpl;

/**
 * @see "https://my.oschina.net/huangyong/blog/161338"
 */
public class Test {

    public static void main(String[] args) {
        Greeting greeting = new JDKDynamicProxy(new GreetingImpl()).getProxy();
        //下面两个方法都会执行 before & after
        greeting.sayHello("Jack");
        greeting.wave(3);
    }
}