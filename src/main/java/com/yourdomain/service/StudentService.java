package com.yourdomain.service;

import com.yourdomain.model.Student;
import org.springframework.stereotype.Component;

@Component
public interface StudentService {
    Student getStudent(Long id);
}
