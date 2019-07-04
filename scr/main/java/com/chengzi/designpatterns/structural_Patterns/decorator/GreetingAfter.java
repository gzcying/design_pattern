package com.chengzi.designpatterns.structural_Patterns.decorator;

import com.chengzi.designpatterns.structural_Patterns.proxy.Greeting;

public class GreetingAfter extends GreetingDecorator {

    public GreetingAfter(Greeting greeting) {
        super(greeting);
    }

    @Override
    public void sayHello(String name) {
        super.sayHello(name);
        after();
    }

    private void after() {
        System.out.println("After");
    }
}