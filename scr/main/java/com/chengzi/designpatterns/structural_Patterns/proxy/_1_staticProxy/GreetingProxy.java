package com.chengzi.designpatterns.structural_Patterns.proxy._1_staticProxy;

import com.chengzi.designpatterns.structural_Patterns.proxy.Greeting;
import com.chengzi.designpatterns.structural_Patterns.proxy.GreetingImpl;

/**
 * 静态代理
 */
public class GreetingProxy implements Greeting {
    //直接代理 实现类
    GreetingImpl greeting;
    public GreetingProxy(GreetingImpl greeting){
        this.greeting=greeting;
    }

    @Override
    public void sayHello(String name) {
        before();
        greeting.sayHello(name);
    }

    @Override
    public void wave(int times) {
        greeting.wave(times);
    }

    private void before() {
        System.out.println("do something before say hello");
    }


}
