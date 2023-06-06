package com.example.onetoone.Service.impl;

import com.example.onetoone.Entity.Card;
import com.example.onetoone.Entity.Course;
import com.example.onetoone.Entity.Student;
import com.example.onetoone.Repository.CourseRepository;
import com.example.onetoone.Repository.StudentRepository;
import com.example.onetoone.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Student addStudent(Student student) {

        //first you need to create child object
        Card card = new Card();
        card.setCardStatus("ACTIVE");
        card.setStudent(student);

        //now set the child object in parent object
        student.setCard(card);

        //it's for course object

        Set<Course> courseList = student.getCourses();

        if(courseList.size() > 0){
            for(int i=0; i<courseList.size(); i++){

            }
        }

        return studentRepository.save(student);
    }

    @Override
    public Student getStudent(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudentCity(int id,String city) {
        Student originalStudent = studentRepository.findById(id).get();

        originalStudent.setCity(city);

        return studentRepository.save(originalStudent);
    }

    public void StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }



}
