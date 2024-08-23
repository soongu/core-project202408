package com.example.coreproject.chap02_03.service;

import com.example.coreproject.chap02_03.model.MyModel;
import com.example.coreproject.chap02_03.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MyRepository myRepository;

    @Autowired
    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public String processData() {
        MyModel model = myRepository.findData();
        return "Processed: " + model.getData();
    }
}
