package com.example.onetoone.Controller;

import com.example.onetoone.Entity.Student;
import com.example.onetoone.Service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping("/addStudent")
    private ResponseEntity<Student> addStudent(@RequestBody Student student){

        Student student1 = studentService.addStudent(student);
        return new ResponseEntity<>(student1,HttpStatus.CREATED);
    }



}
