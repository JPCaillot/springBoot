package com.learning.springBoot.courses.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springBoot.courses.bean.Course;
import com.learning.springBoot.courses.bean.CourseRepository;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository repository;
    
    // http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return repository.findAll();

        //return Arrays.asList(new Course
        //    (1, "Learn Microservices 1", "Learning course"),
        //    new Course(2, "Learn Full Stack", "Learning course"));
    }

    @GetMapping("/courses/{id}")
    public Course getCourseDetails(@PathVariable long id) {
        Optional<Course> course = repository.findById(id);
        if(course.isEmpty()) {
            throw new RuntimeException("Course not found with id " + id);
        }
        return course.get();
        //return getAllCourses().get(0);
    }

    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course) {
        repository.save(course); //inserts if non existant, updates if existant
    }

    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable long id, @RequestBody Course course) {
        repository.save(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id) {
        repository.deleteById(id);
    } //can put a conditional if doesn't exist

}
