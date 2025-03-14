package com.demo.example.student_library_management_system.convertors;

import com.demo.example.student_library_management_system.model.Student;
import com.demo.example.student_library_management_system.requestdto.StudentRequestDto;

public class StudentConvertor {

    public static Student convertStudentDtotoStudent(StudentRequestDto studentRequestDto){
        Student student = new Student();
        student.setName(studentRequestDto.getName());
        student.setDept(studentRequestDto.getDept());
        student.setAddress(studentRequestDto.getAddress());
        student.setDob(studentRequestDto.getDob());
        student.setEmail(studentRequestDto.getEmail());
        student.setSem(studentRequestDto.getSem());
        student.setMobile(studentRequestDto.getMobile());
        return student;
    }
}
