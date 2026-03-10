package com.example.bootvue3learn.controller;
//Bean 是核心：Spring Bean 是由 Spring 容器创建、管理的 Java 对象，区别于手动new的普通对象；
//注解分两类：
//        「创建 Bean」：@Controller/@Service/@Repository/@Component标记类，Spring 自动创建对应 Bean 并存入容器；
//        「使用 Bean」：@Resource/@Autowired标记属性 / 方法，Spring 从容器中取出已创建的 Bean 注入使用；
//核心目的：通过注解让 Spring 统一管理 Bean 的生命周期，实现对象创建与使用的解耦，同时支持单例、AOP、事务等核心功能。

//所有带 @Controller、@Service、@Repository、@Component 这些注解的类，Spring 启动时都会：
//自动创建该类的实例对象（不用你手动 new）；
//把对象存入「Spring 容器」中管理；
//后续其他地方需要用这个对象时，直接从容器里取（依赖注入）。
//不同注解的区别，本质是给对象「贴标签」，明确它的业务职责，而非功能上的本质差异。

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
class HelloController {
    @GetMapping("/hello")
    public String hello(){

        return "hello Spring Boot";
    }
}
