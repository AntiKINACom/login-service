package com.yourdomain.controller;

import com.yourdomain.model.Student;
import com.yourdomain.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/{id}")
    public Student getStudentById(@PathVariable("id") Long id) {
        Student studentResponse = (Student) studentService.getStudent(id);
        return studentResponse;
    }
}
