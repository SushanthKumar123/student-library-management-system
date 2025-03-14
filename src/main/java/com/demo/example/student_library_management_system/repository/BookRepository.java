package com.demo.example.student_library_management_system.repository;

import com.demo.example.student_library_management_system.model.Book;
import com.demo.example.student_library_management_system.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
