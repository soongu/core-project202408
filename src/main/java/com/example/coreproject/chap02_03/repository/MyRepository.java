package com.example.coreproject.chap02_03.repository;

import com.example.coreproject.chap02_03.model.MyModel;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public MyModel findData() {
        // 데이터베이스에서 데이터를 가져오는 것처럼 가정
        return new MyModel("Repository Data");
    }
}
