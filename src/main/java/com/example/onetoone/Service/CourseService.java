package com.example.onetoone.Service;

import com.example.onetoone.Entity.Course;
import com.example.onetoone.Entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface CourseService{

    Course addCourse(Course course);
}
