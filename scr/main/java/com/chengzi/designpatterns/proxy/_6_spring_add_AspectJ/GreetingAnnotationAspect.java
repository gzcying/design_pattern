package com.chengzi.designpatterns.proxy._6_spring_add_AspectJ;

import com.chengzi.designpatterns.proxy.Greeting;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

//方法上的切面
@Aspect
@Component
public class GreetingAnnotationAspect {

    @Around("@annotation(com.chengzi.designpatterns.proxy._6_spring_add_AspectJ.Tag)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        before();
        Object result = joinPoint.proceed();
        after();
        return result;
    }

    private void before() {
        System.out.println("spring + aspectJ annotation: before");
    }

    private void after() {
        System.out.println("spring + aspectJ annotation: after");
    }

}

@Component
class GreetingAnnotationImpl implements Greeting {
    @Tag
    @Override
    public void sayHello(String name) {
        System.out.println("Hello! " + name);
    }

    @Override
    public void wave(int times) {
        System.out.println("waving times is  " + times);
    }
}

class AnnotationTest {
    public static void main(String[] args) {
        /**
         * Spring AOP Advisor（自动代理 切面测试）
         * 只拦截 @tag annotation注解的方法
         * @see "https://my.oschina.net/huangyong/blog/161402"
         */
        //xml声明式测试
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/chengzi/designpatterns/proxy/_6_spring_add_AspectJ/spring.xml");
        GreetingAnnotationImpl greeting = (GreetingAnnotationImpl) context.getBean("greetingAnnotationImpl");
        System.out.println("===@tag annotation注解的拦截==");
        greeting.sayHello("spring + aspectj annotation : QQ");

        System.out.println("\n===waving 不拦截==");
        greeting.wave(3);
    }
}
