package com.example.bootvue3learn.service;
import com.example.bootvue3learn.entity.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

// 是一个注解类，对象由spring框架来创建管理，变量userService用@Autowired注解，其值在编译时候，由spring自动注入
@Service
public class UserService {
    Map<String,User> dataPool;

    public UserService() {
        dataPool = new HashMap<>();
//        User user = new User();
//        user.setName("xiaoming");
//        user.setAge(114);
//        user.setUid("1145");

        // @Bulider注解用法
        User user = User.builder()
                .name("xiaoming")
                .age(100)
                .uid("1145")
                .photo("/images/testPic.png")
                .build();
        dataPool.put(user.getUid(),user);

    }
    public User searchUser(String uid) {
        return dataPool.get(uid);
    }
}
