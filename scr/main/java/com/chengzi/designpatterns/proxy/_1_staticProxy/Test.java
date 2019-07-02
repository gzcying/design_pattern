package com.chengzi.designpatterns.proxy._1_staticProxy;

import com.chengzi.designpatterns.proxy.Greeting;
import com.chengzi.designpatterns.proxy.GreetingImpl;

/**
 * @see "https://my.oschina.net/huangyong/blog/161338"
 */
public class Test {
    public static void main(String[] args) {
        Greeting greeting = new GreetingProxy(new GreetingImpl());
        greeting.sayHello("Jack");
    }
}
