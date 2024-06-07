package com.studentManagement.studentManagementSystem.model.service;

import com.studentManagement.studentManagementSystem.model.dao.CourseRepository;
import com.studentManagement.studentManagementSystem.model.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseManager implements  CourseService{
    @Autowired
   private CourseRepository courseRepository;
    @Override
    public Course getById(int id) {
        return courseRepository.findById(id);
    }
    @Override
    public List<Course> getAll(Course course) {

        return courseRepository.findAll();
    }
    @Override
    public Course newCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(int id, Course course) {
        Course course1 = courseRepository.findById(id);
        if(course1 != null){
            courseRepository.save(course);
        }
        return course;
    }

    @Override
    public Course deleteById(int id) {
        return courseRepository.deleteById(id);
    }
}
