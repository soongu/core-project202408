package com.example.coreproject.chap03_03.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MessageControllerTest {

    @Autowired
    MessageController messageController;

    @Test
    void messageControllerTest() {
        String message = messageController.showMessage();

        System.out.println("message = " + message);
    }
}