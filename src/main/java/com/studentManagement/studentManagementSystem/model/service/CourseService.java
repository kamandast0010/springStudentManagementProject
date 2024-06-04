package com.studentManagement.studentManagementSystem.model.service;

import com.studentManagement.studentManagementSystem.model.domain.Course;

public interface CourseService {
    Course getById (Course course);

    Course getAllById (Course course);
}
