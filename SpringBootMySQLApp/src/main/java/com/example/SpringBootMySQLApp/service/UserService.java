package com.example.SpringBootMySQLApp.service;

import com.example.SpringBootMySQLApp.User;
import com.example.SpringBootMySQLApp.UserRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Transactional
    public void addUser(User user) {
        userRepo.save(user);
        userRepo.flush(); // commit the transaction
        System.out.println("User Added and committed successfully!");
    }
}
