package com.example.bootvue3learn.config;
//@Bean 核心总结
//核心定位：Spring 中手动创建 Bean 的注解，补充 @Controller/@Service 等自动创建 Bean 注解的不足，专门用于控制复杂 / 第三方对象的创建逻辑。
//书写规范：
//只能标记在方法上，且方法需位于 @Configuration 注解的配置类中；
//规范位置是项目 config 包下的配置类，临时场景可写在启动类（不推荐），绝对不能写在 Controller/Service 等业务类中。
//核心逻辑：Spring 执行标注 @Bean 的方法，将方法返回的对象作为 Bean 存入容器，Bean 名称默认是方法名（可自定义），后续可通过 @Resource/@Autowired 注入使用。

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class BeanConfig {
    @Bean
    public Date myDate() {
        Date date = new Date();
        date.setTime(System.currentTimeMillis());
        return date;
    }
}
