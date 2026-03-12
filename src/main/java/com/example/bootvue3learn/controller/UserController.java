package com.example.bootvue3learn.controller;

import com.example.bootvue3learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.bootvue3learn.entity.User;
@RestController
public class UserController {
    // 类似于@Resource,自动注入类
    @Autowired
    UserService userService;

    @GetMapping("/user/search")
    public User getUser(String uid) {
        return userService.searchUser(uid);
    }

}
