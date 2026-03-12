package com.example.bootvue3learn.entity;

import lombok.Data;

//@Data注解可以使其自带get和set方法
@Data
public class User {
    private String uid;
    private String name;
    private int age;
    private String photo;
    private String intro;

    public enum Gender {
        MALE,
        FEMALE
    }
    private Gender gender;
}
