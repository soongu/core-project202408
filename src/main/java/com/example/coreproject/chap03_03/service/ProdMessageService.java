// src/main/java/com/example/coreproject/chap03_03/service/ProdMessageService.java
package com.example.coreproject.chap03_03.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "This is the production environment";
    }
}
