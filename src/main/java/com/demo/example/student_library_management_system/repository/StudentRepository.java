package com.demo.example.student_library_management_system.repository;

import com.demo.example.student_library_management_system.model.Student;
import com.demo.example.student_library_management_system.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
