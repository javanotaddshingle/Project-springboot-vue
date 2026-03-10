package com.example.bootvue3learn.controller;
// @Value用法
//@Value 注入的本质是：Spring 创建 Bean 时，会主动解析注解、从环境中取值并赋值给属性。而你手动 new valueReadController() 时：
//这个对象是「普通 Java 对象」，不属于 Spring Bean；
//Spring 完全不知道这个对象的存在，不会执行任何注解解析逻辑；
//因此 applicationName 和 sqlPassword 始终是默认值 null。
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class ValueReadController {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${spring.datasource.password}")
    private String sqlPassword;

    public String getApplicationName() {
        return applicationName;
    }

    public String getSqlPassword() {
        return sqlPassword;
    }

}
