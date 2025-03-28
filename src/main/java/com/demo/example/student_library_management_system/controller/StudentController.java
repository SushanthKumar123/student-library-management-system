package com.demo.example.student_library_management_system.controller;

import com.demo.example.student_library_management_system.model.Student;
import com.demo.example.student_library_management_system.requestdto.StudentRequestDto;
import com.demo.example.student_library_management_system.service.StudentService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/apis")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<?> saveStudent(@RequestBody  StudentRequestDto studentRequestDto){
        try{
            String response = studentService.saveStudent(studentRequestDto);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("issue witth data");
        }
    }

    @GetMapping("/findDept")
    public List<Student> findByDept(@RequestParam String sem,@RequestParam String dept){
        List<Student> data = studentService.findBydept(sem,dept);
        return data;
    }
}
