// src/main/java/com/example/coreproject/chap04_02/service/UserServiceImpl.java
package com.example.coreproject.chap04_02.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserDetails(String username) {
        // 예시로, 간단한 사용자 정보 조회
        return "User: " + username + ", Role: User";
    }

    @Override
    public void performAdminTask() {
        // 관리자 작업 수행 (예: 데이터베이스 백업)
        System.out.println("Admin task performed");
    }
}
