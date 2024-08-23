// src/main/java/com/example/coreproject/chap02_04/service/StudentService.java
package com.example.coreproject.chap02_04.service;

import com.example.coreproject.chap02_04.model.Student;
import com.example.coreproject.chap02_04.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    // @Qualifier를 사용하여 highSchoolStudentRepository를 주입
    @Autowired
    public StudentService(@Qualifier("highSchoolStudentRepository") StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudentDetails(String studentId) {
        return studentRepository.findStudentById(studentId);
    }
}
