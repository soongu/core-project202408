package com.example.coreproject.chap02_01.config;

import com.example.coreproject.chap02_01.service.GreetingService;
import com.example.coreproject.chap02_01.service.GreetingServiceImpl;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    public GreetingService greetingService() {
        return new GreetingServiceImpl();
    }
}
