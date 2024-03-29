[https://my.oschina.net/huangyong/blog/161402]

9. Spring AOP：切面

之前谈到的 AOP 框架其实可以将它理解为一个拦截器框架，但这个拦截器似乎非常武断。
比如说，如果它拦截了一个类，那么它就拦截了这个类中所有的方法。
类似地，当我们在使用动态代理的时候，其实也遇到了这个问题。
需要在代码中对所拦截的方法名加以判断，才能过滤出我们需要拦截的方法，想想这种做法确实不太优雅。
在大量的真实项目中，似乎我们只需要拦截特定的方法就行了，没必要拦截所有的方法。
于是，老罗同志借助了 AOP 的一个很重要的工具，**Advisor（切面）**，来解决这个问题。它也是 AOP 中的核心！是我们关注的重点！

也就是说，我们可以通过切面，将增强类与拦截匹配条件组合在一起，然后将这个切面配置到 ProxyFactory 中，从而生成代理。

这里提到这个“拦截匹配条件”在 AOP 中就叫做 **Pointcut（切点）**，其实说白了就是一个基于表达式的拦截条件罢了。

归纳一下，**Advisor（切面）封装了 Advice（增强）与 Pointcut（切点）** 。当您理解了这句话后，就往下看吧。

