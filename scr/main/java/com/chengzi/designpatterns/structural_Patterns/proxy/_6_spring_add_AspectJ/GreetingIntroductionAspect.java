package com.chengzi.designpatterns.structural_Patterns.proxy._6_spring_add_AspectJ;

import com.chengzi.designpatterns.structural_Patterns.proxy.Greeting;
import com.chengzi.designpatterns.structural_Patterns.proxy._4_springAOP.classAdvice.Apology;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 */
@Aspect
@Component
public class GreetingIntroductionAspect {

    @DeclareParents(value = "com.chengzi.designpatterns.structural_Patterns.proxy._6_spring_add_AspectJ.GreetingIntroductionImpl", defaultImpl = ApologyImpl.class)
    private Apology apology;
}

 class IntroductionTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/chengzi/designpatterns/structural_Patterns/proxy/_6_spring_add_AspectJ/spring.xml");
        Greeting greeting = (Greeting) context.getBean("greetingIntroductionImpl");
        greeting.sayHello("by spring + aspectj introduction: Tom ");

        Apology apology = (Apology) greeting;
        apology.saySorry("jerry");

    }
}


@Component
class GreetingIntroductionImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println(" declareParents　:　Hello!  " + name);
    }

    @Override
    public void wave(int times) {
        System.out.println("waving times is  " + times);
    }
}

@Component
class ApologyImpl implements Apology {

    @Override
    public void saySorry(String name) {
        System.out.println(" spring aspect declareParents : so sorry to " + name);
    }
}

