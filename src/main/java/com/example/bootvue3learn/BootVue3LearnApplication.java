package com.example.bootvue3learn;

import com.example.bootvue3learn.controller.ValueReadController;
import jakarta.annotation.Resource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootVue3LearnApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext= SpringApplication.run(BootVue3LearnApplication.class, args);


//        try {
//            Date myDateBean = (Date) applicationContext.getBean("myDate");
//            System.out.println("✅ 成功找到myDate Bean：" + myDateBean);
//        } catch (Exception e) {
//            System.out.println("❌ 未找到myDate Bean，原因：" + e.getMessage());
//        }
//        System.out.println("=====bean容器内所有对象=====");
//        String []strs = applicationContext.getBeanDefinitionNames();
//        for(String str:strs) {
//            System.out.println(str);
//        }
//        System.out.println("==========");

//        通过Resource查找和注入bean对象

    }

}
