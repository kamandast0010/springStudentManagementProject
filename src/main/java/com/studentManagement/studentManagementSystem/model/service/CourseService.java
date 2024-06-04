package com.studentManagement.studentManagementSystem.model.service;

import com.studentManagement.studentManagementSystem.model.domain.Course;

import java.util.List;

public interface CourseService {
    Course getById (int id);

    List<Course> getAll(Course course);

}
