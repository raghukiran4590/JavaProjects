package com.example.something;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {

public World world;

    @GetMapping("/api/car")
    public String getHello() {
        return world.sayHello();
    }

}
