package com.example.onetoone.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_duration")
    private String courseDuration;

    private int price;

//    @ManyToMany(mappedBy = "courseList",fetch = FetchType.LAZY)
//    @JsonBackReference
//    List<Student> studentList = new ArrayList<>();

}
