// src/main/java/com/example/coreproject/chap02_03/config/AppConfig.java
package com.example.coreproject.chap02_03.config;

import com.example.coreproject.chap02_03.controller.MyController;
import com.example.coreproject.chap02_03.model.MyModel;
import com.example.coreproject.chap02_03.repository.MyRepository;
import com.example.coreproject.chap02_03.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.coreproject.chap02_03")
public class AppConfig {
    // 스프링 빈 설정은 @ComponentScan으로 자동으로 설정됨
//
//
//    @Bean
//    public MyRepository myRepository() {
//        return new MyRepository();
//    }
//
//    @Bean
//    public MyService myService() {
//        return new MyService(myRepository());
//    }
//
//    @Bean
//    public MyController myController() {
//        return new MyController(myService());
//    }

}
