package com.example.onetoone.Service;

import com.example.onetoone.Entity.Student;
import com.example.onetoone.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.Style;

@Service
public interface StudentService {

    Student addStudent(Student student);

    Student getStudent(int id);

    Student updateStudentCity(int id,String city);
}
