package com.example.something;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WhatupApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhatupApplication.class, args);
		System.out.println("Welcome to Whatup Application");
	}
}
