// src/main/java/com/example/coreproject/chap02_04/controller/StudentController.java
package com.example.coreproject.chap02_04.controller;

import com.example.coreproject.chap02_04.model.Student;
import com.example.coreproject.chap02_04.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void printStudentDetails(String studentId) {
        Student student = studentService.getStudentDetails(studentId);
        System.out.println("학생 ID: " + student.getStudentId());
        System.out.println("이름: " + student.getName());
        System.out.println("학년: " + student.getGrade());
    }
}
