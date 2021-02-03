package com.yourdomain.service;

import com.yourdomain.model.Student;
import com.yourdomain.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Transactional(readOnly = true)
    public Student getStudent(Long id) {
        studentRepository.findById(id);
        return null;
    }
}
