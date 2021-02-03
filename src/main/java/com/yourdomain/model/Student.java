package com.yourdomain.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "students")
@Entity
public class Student extends AppUser {

    @Getter
    @Column(updatable = false, nullable = false)
    private final Integer studentId;

    @Getter
    @Column(nullable = false)
    private final String studentName;

    public Student(String username, String email, String password, int studentId, String studentName) {
        super(username, email, password);
        this.studentId = studentId;
        this.studentName = studentName;
    }
}
