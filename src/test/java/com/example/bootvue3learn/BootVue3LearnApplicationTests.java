package com.example.bootvue3learn;

import com.example.bootvue3learn.controller.ValueReadController;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootVue3LearnApplicationTests {

    @Test
    void contextLoads() {
        System.out.println();
    }

    // 需要写在bean类下，完成注入，并在test中使用
    @Resource(name = "valueReadController")
    private ValueReadController r;

    @Test
    public void testRead() {
        System.out.println(r.getApplicationName());
        System.out.println(r.getSqlPassword());
    }

}
