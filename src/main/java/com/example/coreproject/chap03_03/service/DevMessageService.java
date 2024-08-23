// src/main/java/com/example/coreproject/chap03_03/service/DevMessageService.java
package com.example.coreproject.chap03_03.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "This is the development environment";
    }
}
