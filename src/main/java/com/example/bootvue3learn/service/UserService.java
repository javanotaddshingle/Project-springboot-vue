package com.example.bootvue3learn.service;
import com.example.bootvue3learn.entity.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    Map<String,User> dataPool;

    public UserService() {
        dataPool = new HashMap<>();
        User user = new User();
        user.setName("xiaoming");
        user.setAge(114);
        user.setUid("1145");
        dataPool.put(user.getUid(),user);

    }
    public User searchUser(String uid) {
        return dataPool.get(uid);
    }
}
