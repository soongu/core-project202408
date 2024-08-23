package com.example.coreproject.chap02_01.service;

import org.springframework.stereotype.Service;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
