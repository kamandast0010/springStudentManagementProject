package com.studentManagement.studentManagementSystem.model.service;

import com.studentManagement.studentManagementSystem.model.domain.Student;

public interface StudentService {
    Student getById (Student student);

    Student getAllById (Student student);
}
