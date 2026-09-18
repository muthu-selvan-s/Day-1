package com.sece.student_management.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sece.student_management.entity.Student;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sece.student_management.service.StudentServices;
import org.springframework.web.bind.annotation.PutMapping;




@RestController 
public class StudentController {
    private final StudentServices studentService;

    public StudentController(StudentServices studentService){
        this.studentService = studentService;
    }
    @GetMapping("/hello")
    public String hello() {
        return "successful";
    }
    @PostMapping("/students")
    public Student createstudents(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
    
    @GetMapping("/students")
    public List <Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    @GetMapping("/Students/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        
        return studentService.getStudentById(id);
    }
    @DeleteMapping ("/students/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
    
}