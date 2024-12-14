package com.example.demo.controller;

import com.example.demo.models.Demo;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController2 {

    private final Demo demo;

    public DemoController2(Demo demo) {
        System.out.println("In DemoController2 constructor:" + demo);
        this.demo = demo;
    }
}
