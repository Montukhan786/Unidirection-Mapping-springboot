package com.example.onetoone.Controller;

import com.example.onetoone.Entity.Course;
import com.example.onetoone.Service.impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("course")
public class CourseController {


    @Autowired
    CourseServiceImpl courseService;

    @PostMapping("/add-course")
    private ResponseEntity<Course> addCourse(@RequestBody Course course){
        return new ResponseEntity<>(courseService.addCourse(course), HttpStatus.CREATED);
    }
}
