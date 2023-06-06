package com.example.onetoone.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "student")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(unique = true)
    private String email;

    private int age;

    private String city;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    @JsonIgnore
    private Card card;

    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    @JoinTable(name = "student_course_table",
    joinColumns = {
            @JoinColumn(name="student_id")
    },
    inverseJoinColumns = {
            @JoinColumn(name = "course_id")
    }
    )
    private Set<Course> courses = new HashSet<>();


}
