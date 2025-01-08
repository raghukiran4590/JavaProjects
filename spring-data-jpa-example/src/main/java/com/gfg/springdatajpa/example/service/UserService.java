package com.gfg.springdatajpa.example.service;

import java.util.ArrayList;
import java.util.List;

import com.gfg.springdatajpa.example.model.UserRecord;
import com.gfg.springdatajpa.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<UserRecord> getAllUsers() {
        List<UserRecord> UserRecords = new ArrayList<>();
        userRepository.findAll().forEach(UserRecords::add);
        return UserRecords;
    }

    public void addUser(UserRecord userRecord) {
        userRepository.save(userRecord);
    }
}

