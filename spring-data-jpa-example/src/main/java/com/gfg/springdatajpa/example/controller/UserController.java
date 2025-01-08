package com.gfg.springdatajpa.example.controller;

import com.gfg.springdatajpa.example.model.UserRecord;
import com.gfg.springdatajpa.example.repository.UserRepository;
import com.gfg.springdatajpa.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<UserRecord> getAllUser() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/add-user", method = RequestMethod.POST)
    public void addUser(@RequestBody UserRecord userRecord) {
        userService.addUser(userRecord);
    }
}
