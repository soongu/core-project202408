package com.example.coreproject.chap02_03.controller;

import com.example.coreproject.chap02_03.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    public void handleRequest() {
        String result = myService.processData();
        System.out.println("Controller Output: " + result);
    }
}
