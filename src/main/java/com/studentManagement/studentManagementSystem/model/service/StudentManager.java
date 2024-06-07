package com.studentManagement.studentManagementSystem.model.service;

import com.studentManagement.studentManagementSystem.model.dao.StudentRepository;
import com.studentManagement.studentManagementSystem.model.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentManager implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> getAllStudents(Student student) {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(int id,Student student) {
        Student newStudent = studentRepository.findById(id).orElse(null);
        if (newStudent != null){
            studentRepository.save(student);
        }
        return student;
    }

    @Override
    public Student deleteStudent(int id) {
         studentRepository.deleteById(id);
         return null;
    }
}
