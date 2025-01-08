package com.gfg.springdatajpa.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.gfg.springdatajpa.example.repository")
@EntityScan("com.gfg.springdatajpa.example.model")
public class SpringDataJpaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaExampleApplication.class, args);
		System.out.println("Welcome to Spring Data JPA");
	}

}
