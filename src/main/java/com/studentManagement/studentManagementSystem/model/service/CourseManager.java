package com.studentManagement.studentManagementSystem.model.service;

import com.studentManagement.studentManagementSystem.model.dao.CourseRepository;
import com.studentManagement.studentManagementSystem.model.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseManager implements  CourseService {

    @Autowired
   private CourseRepository courseRepository;
    @Override
    public Course getById(Course course) {
        return courseRepository.getById();
    }

    @Override
    public Course getAllById(Course course) {
        return (Course) courseRepository.findAll();
    }
}
