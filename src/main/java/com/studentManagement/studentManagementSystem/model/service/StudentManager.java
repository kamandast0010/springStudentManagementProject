package com.studentManagement.studentManagementSystem.model.service;

import com.studentManagement.studentManagementSystem.model.dao.StudentRepository;
import com.studentManagement.studentManagementSystem.model.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentManager implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student getById(Student student) {
        return studentRepository.getById();
    }

    @Override
    public Student getAllById(Student student) {
        return (Student) studentRepository.findAll();
    }
}
