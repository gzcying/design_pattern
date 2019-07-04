package com.chengzi.designpatterns.structural_Patterns.proxy._6_spring_add_AspectJ;

import com.chengzi.designpatterns.structural_Patterns.proxy.Greeting;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Spring + AspectJ 自动代理（基于注解：通过 AspectJ execution 表达式拦截方法）
 *
 * @see "https://my.oschina.net/huangyong/blog/161402"
 * <p>
 * 注意：类上面标注的 @Aspect 注解，这表明该类是一个 Aspect（其实就是 Advisor）。
 * 该类无需实现任何的接口，只需定义一个方法（方法叫什么名字都无所谓），只需在方法上标注 @Around 注解，在注解中使用了 AspectJ 切点表达式。
 * 方法的参数中包括一个 ProceedingJoinPoint 对象，它在 AOP 中称为 Joinpoint（连接点），可以通过该对象获取方法的任何信息，例如：方法名、参数等。
 * 下面重点来分析一下这个切点表达式：
 * <p>
 * execution(* aop.demo.GreetingImpl.*(..))
 * execution()：表示拦截方法，括号中可定义需要匹配的规则。
 * 第一个“*”：表示方法的返回值是任意的。
 * 第二个“*”：表示匹配该类中所有的方法。
 * (..)：表示方法的参数是任意的。
 */

@Aspect
@Component
public class GreetingMethodAspect {

    @Around("execution(* com.chengzi.designpatterns.structural_Patterns.proxy.GreetingImpl.say*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        before();
        Object result = pjp.proceed();
        after();
        return result;
    }

    private void before() {
        System.out.println("spring + aspectJ: before");
    }

    private void after() {
        System.out.println("spring + aspectJ: after");
    }

}

class MethodTest{
    public static void main(String[] args) {
        /**
         * Spring AOP Advisor（自动代理 切面测试）
         * 只拦截 say 开头的方法
         * @see "https://my.oschina.net/huangyong/blog/161402"
         */
        //xml声明式测试
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/chengzi/designpatterns/structural_Patterns/proxy/_6_spring_add_AspectJ/spring.xml");
        Greeting greeting = (Greeting) context.getBean("greetingAnnotationImpl");
        System.out.println("===say方法开头的拦截==");
        greeting.sayHello("by spring + aspectj: Tom ");

        System.out.println("\n ===wave方法不拦截===");
        greeting.wave(3);
    }
}
