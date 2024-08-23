package com.example.coreproject.chap02_03.controller;

import com.example.coreproject.chap02_03.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;


class MyControllerTest {

    @Test
    void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyController controller = context.getBean(MyController.class);
        controller.handleRequest();
    }
}