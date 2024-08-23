// src/test/java/com/example/coreproject/chap04_02/UserServiceTest.java
package com.example.coreproject.chap04_02;

import com.example.coreproject.chap04_02.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    void testGetUserDetails() {
        String userDetails = userService.getUserDetails("kim");
        System.out.println("User Details: " + userDetails);
    }

    @Test
    void testPerformAdminTask() {
        userService.performAdminTask();
    }
}
