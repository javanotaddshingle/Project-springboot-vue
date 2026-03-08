package com.example.bootvue3learn.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class helloController {
    @GetMapping("/hello")
    public String hello(){

        return "hello Spring Boot";
    }
}
