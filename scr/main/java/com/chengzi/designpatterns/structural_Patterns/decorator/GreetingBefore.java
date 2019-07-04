package com.chengzi.designpatterns.structural_Patterns.decorator;

import com.chengzi.designpatterns.structural_Patterns.proxy.Greeting;

public class GreetingBefore extends GreetingDecorator {

    public GreetingBefore(Greeting greeting) {
        super(greeting);
    }

    @Override
    public void sayHello(String name) {
        before();
        super.sayHello(name);
    }

    private void before() {
        System.out.println("Before");
    }
}