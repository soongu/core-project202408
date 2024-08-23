// src/main/java/com/example/coreproject/chap02_04/config/AppConfig.java
package com.example.coreproject.chap02_04.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("app4")
@ComponentScan(basePackages = "com.example.coreproject.chap02_04")
public class AppConfig {
    // @ComponentScan으로 지정된 패키지 내에서 스캔하여 빈으로 등록
}
