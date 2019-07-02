package com.chengzi.designpatterns.decorator;

import com.chengzi.designpatterns.proxy.Greeting;

public abstract class GreetingDecorator implements Greeting {

    private Greeting greeting;

    public GreetingDecorator(Greeting greeting) {
        this.greeting = greeting;
    }

    @Override
    public void sayHello(String name) {
        greeting.sayHello(name);
    }

    @Override
    public void wave(int times) {
        greeting.wave(times);
    }
}