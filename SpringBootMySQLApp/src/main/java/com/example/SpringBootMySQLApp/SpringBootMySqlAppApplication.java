package com.example.SpringBootMySQLApp;

import com.example.SpringBootMySQLApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import java.util.Optional;

@SpringBootApplication
public class SpringBootMySqlAppApplication implements CommandLineRunner{

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMySqlAppApplication.class, args);
		System.out.println("Welcome to SpringBoot MySQL JPA Implementation");
	}

	@Override
	public void run(String... args) throws Exception {

		User first = new User(99,"Neetha Kiran", 1L);
		userService.addUser(first);
//		Optional<User> userRecord = ob.findById(2);
//		userRecord.stream().forEach(e->{
//			System.out.print(e.id+" "+e.name);
//		});

	}
}

