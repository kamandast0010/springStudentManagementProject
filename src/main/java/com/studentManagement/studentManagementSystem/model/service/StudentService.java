package com.studentManagement.studentManagementSystem.model.service;

import com.studentManagement.studentManagementSystem.model.domain.Student;

import java.util.List;

public interface StudentService {
    Student getById (int id);

    List<Student> getAllStudents(Student student);

    Student saveStudent(Student student);
}
