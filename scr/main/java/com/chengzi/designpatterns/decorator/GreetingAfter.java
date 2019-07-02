package com.chengzi.designpatterns.decorator;

import com.chengzi.designpatterns.proxy.Greeting;

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