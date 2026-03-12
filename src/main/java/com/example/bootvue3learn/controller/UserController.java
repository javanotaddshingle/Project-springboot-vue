package com.example.bootvue3learn.controller;

import com.example.bootvue3learn.service.UserService;
import com.example.bootvue3learn.view.UserRender;
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
    @GetMapping("/user/search/html")
    public String getUserHtml(String uid) {
        // 步骤1：通过uid查询用户
        User user = userService.searchUser(uid);
        // 步骤2：调用UserRender的静态方法，传入user生成HTML字符串
        String html = UserRender.renderUserHtml(user);
        // 步骤3：返回拼接好的HTML（不是toString()）
        return html;
    }

}
