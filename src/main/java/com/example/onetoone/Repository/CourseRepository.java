package com.example.onetoone.Repository;

import com.example.onetoone.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
    //List<Course> findByPriceLessThen(int price);
}
