package com.studentManagement.studentManagementSystem.model.dao;

import com.studentManagement.studentManagementSystem.model.domain.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
