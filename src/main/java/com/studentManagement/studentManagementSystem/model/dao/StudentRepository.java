package com.studentManagement.studentManagementSystem.model.dao;

import com.studentManagement.studentManagementSystem.model.domain.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student, Integer> {
}
