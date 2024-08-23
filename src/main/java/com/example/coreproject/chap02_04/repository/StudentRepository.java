// src/main/java/com/example/coreproject/chap02_04/repository/StudentRepository.java
package com.example.coreproject.chap02_04.repository;

import com.example.coreproject.chap02_04.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public Student findStudentById(String studentId) {
        // 실제 데이터베이스 조회 대신 하드코딩된 데이터 반환
        return new Student(studentId, "홍길동", "초등학생");
    }
}
