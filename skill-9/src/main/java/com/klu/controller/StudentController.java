package com.klu.controller;

import org.springframework.web.bind.annotation.*;

import com.klu.exception.InvaildInputException;
import com.klu.exception.StudentNotFoundException;
import com.klu.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id){

        if(id<=0){
            throw new InvaildInputException("Student ID must be positive");
        }

        if(id!=101){
            throw new StudentNotFoundException("Student with ID "+id+" not found");
        }

        return new Student(101,"Sai Uday","Computer Science");
    }
}