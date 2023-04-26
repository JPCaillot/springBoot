package com.learning.springBoot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.springBoot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
