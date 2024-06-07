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
@Table(name = "student_table")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String contact;
    private String address;
    private String gender;

    @OneToMany
    @JoinColumn(name = "course_id")
    private List<Course> course;
}
