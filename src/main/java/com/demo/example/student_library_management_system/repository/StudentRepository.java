package com.demo.example.student_library_management_system.repository;

import com.demo.example.student_library_management_system.model.Student;
import com.demo.example.student_library_management_system.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    public List<Student> findBySemAndDept(String inSem,String inDept);

    @Query(nativeQuery = true,value = "select * from student where dept=:Dept")
    public List<Student> getbyDept(String Dept);



}



