package com.studentManagement.studentManagementSystem.model.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "course_table")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String course_name;
    private String description;
    private String instructor;

    @OneToMany
    @JoinColumn(name = "student_id")
    private List<Student> student;


}
