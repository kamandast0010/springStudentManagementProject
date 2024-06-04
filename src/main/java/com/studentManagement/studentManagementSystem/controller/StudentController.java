package com.studentManagement.studentManagementSystem.controller;

import com.studentManagement.studentManagementSystem.model.domain.Student;
import com.studentManagement.studentManagementSystem.model.service.StudentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController{
    @Autowired
    private StudentManager studentManager;
    @GetMapping("/student")
    public List<Student> getAllStudent(Student student){
        return studentManager.getAllStudents(student);
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentManager.getById(id);
    }

}
