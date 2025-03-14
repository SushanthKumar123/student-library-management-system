package com.demo.example.student_library_management_system.repository;

import com.demo.example.student_library_management_system.model.Card;
import com.demo.example.student_library_management_system.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
