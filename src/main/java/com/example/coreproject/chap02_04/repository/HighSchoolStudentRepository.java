// src/main/java/com/example/coreproject/chap02_04/repository/HighSchoolStudentRepository.java
package com.example.coreproject.chap02_04.repository;

import com.example.coreproject.chap02_04.model.Student;
import org.springframework.stereotype.Repository;

@Repository("highSchoolStudentRepository")
public class HighSchoolStudentRepository extends StudentRepository {

    @Override
    public Student findStudentById(String studentId) {
        // 하드코딩된 고등학생 데이터 반환
        return new Student(studentId, "이영희", "고등학생");
    }
}
