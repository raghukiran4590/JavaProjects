package com.example.SpringBootMySQLApp.repository;

import com.example.SpringBootMySQLApp.models.StudentInformation;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import java.util.Optional;

    public interface StudentRepository extends JpaRepository<StudentInformation,Integer> {


    }
