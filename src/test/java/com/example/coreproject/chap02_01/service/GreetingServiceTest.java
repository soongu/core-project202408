package com.example.coreproject.chap02_01.service;

import com.example.coreproject.chap02_01.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;


class GreetingServiceTest {

    @Test
    void greetTest() {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        GreetingService greetingService = context.getBean(GreetingService.class);

        String message = greetingService.greet("김철수");
        System.out.println("message = " + message);
    }
}