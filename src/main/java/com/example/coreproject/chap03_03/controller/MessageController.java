package com.example.coreproject.chap03_03.controller;

import com.example.coreproject.chap03_03.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    public String showMessage() {
        return messageService.getMessage();
    }

}
