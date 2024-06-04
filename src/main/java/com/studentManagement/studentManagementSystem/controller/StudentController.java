package com.studentManagement.studentManagementSystem.controller;

import com.studentManagement.studentManagementSystem.model.domain.Student;
import com.studentManagement.studentManagementSystem.model.service.StudentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id,@RequestBody Student student) {
        return studentManager.updateStudent(id, student);
    }
    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return studentManager.saveStudent(student);
    }

    @DeleteMapping("student/{id}")
    public Student deleteStudent(@PathVariable int id){
        return studentManager.deleteStudent(id);
    }

}
