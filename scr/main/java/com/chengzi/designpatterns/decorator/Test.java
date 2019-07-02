package com.chengzi.designpatterns.decorator;

import com.chengzi.designpatterns.proxy.GreetingImpl;

/**
 * @author chengzi
 * 2019/6/28
 */
public class Test {
    public static void main(String[] args) {
        GreetingImpl impl = new GreetingImpl();
        GreetingAfter after = new GreetingAfter(impl);
        after.sayHello("after name ");
        System.out.println("====");
        GreetingBefore before = new GreetingBefore(impl);
        before.sayHello("before name");
        System.out.println("====");
        GreetingBefore both = new GreetingBefore(after);
        both.sayHello("both name");
        System.out.println("====");
    }
}
