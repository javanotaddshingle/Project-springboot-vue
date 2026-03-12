package com.example.bootvue3learn.view;

import com.example.bootvue3learn.entity.User;
import org.springframework.stereotype.Component;

@Component
// 专门负责拼接用户相关的HTML字符串
public class UserRender {

    // 传入User对象，返回包含图片的完整HTML字符串
    public static String renderUserHtml(User user) {
        if (user == null) {
            return "<html><body><h3 style='color:red;'>用户不存在</h3></body></html>";
        }

        // 拼接HTML，核心是img标签的src指向图片资源路径
        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>")
                .append("<html lang='zh-CN'>")
                .append("<head>")
                .append("<meta charset='UTF-8'>")
                .append("<title>用户信息</title>")
                .append("<style>")
                .append(".user-box { padding: 20px; font-family: Arial; }")
                .append("img { width: 200px; height: auto; margin-top: 10px; }")
                .append("</style>")
                .append("</head>")
                .append("<body>")
                .append("<div class='user-box'>")
                .append("<h2>用户信息</h2>")
                .append("<p>UID：").append(user.getUid()).append("</p>")
                .append("<p>姓名：").append(user.getName()).append("</p>")
                .append("<p>年龄：").append(user.getAge()).append("</p>")
                // 关键：拼接图片完整URL（后端静态资源路径）
                .append("<img src='http://localhost:8080").append(user.getPhoto()).append("' alt='用户头像'>")
                .append("</div>")
                .append("</body>")
                .append("</html>");

        return html.toString();
    }
}