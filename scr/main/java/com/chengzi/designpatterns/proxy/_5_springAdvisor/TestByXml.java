package com.chengzi.designpatterns.proxy._5_springAdvisor;

import com.chengzi.designpatterns.proxy.Greeting;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring AOP Advisor（切面测试），切面与增强不同，请看readme文件
 * 只拦截 say 开头的方法
 * @see "https://my.oschina.net/huangyong/blog/161402"
 */
public class TestByXml {

    //xml声明式测试（不能自动代理，即：每个类的切面和代理都需要拷贝差不多的代码）
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/chengzi/designpatterns/proxy/_5_springAdvisor/spring.xml");
        Greeting greeting = (Greeting) context.getBean("greetingProxy");
        System.out.println("===say方法开头的拦截===");
        greeting.sayHello("by spring advisor: Tom ");

        System.out.println("\n ===wave方法不拦截===");
        greeting.wave(3);
    }
}
