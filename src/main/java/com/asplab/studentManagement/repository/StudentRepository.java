package com.asplab.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asplab.studentManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
