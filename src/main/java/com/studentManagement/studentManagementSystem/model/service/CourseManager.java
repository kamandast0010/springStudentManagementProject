package com.studentManagement.studentManagementSystem.model.service;

import com.studentManagement.studentManagementSystem.model.dao.CourseRepository;
import com.studentManagement.studentManagementSystem.model.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CourseManager implements  CourseService{

    @Autowired
   private CourseRepository courseRepository;

    @Override
    public Course getById(int id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public List<Course> getAll(Course course) {
        return courseRepository.findAll();
    }
}
