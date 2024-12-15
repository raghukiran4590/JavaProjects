package com.example.something;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {

    @Autowired
    private World world;

    @GetMapping("/api/ok")
    public String ok() {
//        world = new World();
        return world.sayHello();
    }

}
