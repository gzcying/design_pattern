package com.chengzi.designpatterns.proxy;

import org.springframework.stereotype.Component;

/**
 * @author chengzi
 * 2019/6/28
 */
@Component
public class GreetingImpl implements Greeting {

    @Override
    public void sayHello(String name) {
        System.out.format("GreetingImpl say hello to  %s \n" ,name);
    }

    @Override
    public void wave(int times) {
        System.out.format("GreetingImpl say wave %s times \n" ,times);
    }
}
