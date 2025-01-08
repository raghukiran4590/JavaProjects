package com.example.SpringBootMySQLApp.service;

import com.example.SpringBootMySQLApp.models.StudentInformation;
import com.example.SpringBootMySQLApp.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public void addUser(StudentInformation studentInformation) {
        studentRepository.saveAndFlush(studentInformation);
//        studentRepository.flush(); // commit the transaction
        System.out.println("Student Added and committed successfully!");
    }
}
