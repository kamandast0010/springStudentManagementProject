package com.studentManagement.studentManagementSystem.controller;
import com.studentManagement.studentManagementSystem.model.domain.Course;
import com.studentManagement.studentManagementSystem.model.service.CourseManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
   private CourseManager courseManager;
    @PostMapping("/NewCourse")
    public Course newCourse(@RequestBody Course course){
        return courseManager.newCourse(course);
    }

    @GetMapping("/courses")
    public List<Course> getAllCourse(Course course){
        return courseManager.getAll(course);
    }

    @GetMapping("/course/{id}")
    public Course getCourseById(@PathVariable int id){
        return courseManager.getById(id);
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable int id, @RequestBody Course course){
        return courseManager.updateCourse(id,course);
    }

    @DeleteMapping("/course/{id}")
    public Course deleteCourse(@PathVariable int id,@RequestBody Course course){
        return courseManager.deleteById(id);
    }
}
