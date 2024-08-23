package com.example.coreproject.chap02_04.controller;

import com.example.coreproject.chap02_04.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    @Test
    void studentTest() {
        // 스프링 애플리케이션 컨텍스트 초기화
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // StudentController 빈 가져오기
        StudentController controller = context.getBean(StudentController.class);

        // StudentController를 통해 학생 정보 출력
        controller.printStudentDetails("STU123");
    }

}