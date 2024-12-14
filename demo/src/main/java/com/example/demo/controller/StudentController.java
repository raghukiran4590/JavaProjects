package com.example.demo.controller;

import com.example.demo.models.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private static Logger log = LoggerFactory.getLogger(StudentController.class);

    @GetMapping("/api/student")
    public void getStudentDetail(@RequestParam int rollNo) {
        log.info("Request Param Received : {}", rollNo);
    }

    @GetMapping("/api/student/{studentName}")
    public void getStudentDetailsByPathParam(@PathVariable String studentName) {
        log.info("Path Param Received : {}", studentName);
    }

    @GetMapping("/api/student/details")
    public Student getStudentDetails() {
        Student student = new Student(542, "Raghu Kiran", 99);
        log.info(student.toString());
        return student;
    }

    @PostMapping(value = {"/api/student", "/api/stu"})
    public void postStudentDetails(@RequestBody Student st) {
        log.info("Request body received: {}", st);
    }

}
