package com.chengzi.designpatterns.structural_Patterns.proxy._3_cglibProxy;

import com.chengzi.designpatterns.structural_Patterns.proxy.GreetingImpl;

/**
 * @see "https://my.oschina.net/huangyong/blog/161338"
 */
public class Test {

    public static void main(String[] args) {
        GreetingImpl impl = CGLibDynamicProxy.getInstance().getProxy(GreetingImpl.class);
        impl.sayHello("cglib john");
        impl.wave(3);
    }
}
