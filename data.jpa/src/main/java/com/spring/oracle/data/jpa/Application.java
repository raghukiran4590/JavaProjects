package com.spring.oracle.data.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.oracle.data.jpa.entities.ContactsMasterEntity;
import com.spring.oracle.data.jpa.repositories.ContactsMasterRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Oracle Spring Data JPA!!!");
		
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		
		ContactsMasterRepo contactsMasterRepo = ctxt.getBean(ContactsMasterRepo.class);
		
		ContactsMasterEntity contactsMasterEntity = new ContactsMasterEntity();
		
		
		contactsMasterEntity.setContactId(1);
		contactsMasterEntity.setContactName("Raghu Kiran");
		contactsMasterEntity.setContactNumber(9849687195l);
		
		contactsMasterRepo.save(contactsMasterEntity);
		
		System.out.println("Record Inserted Successfully!!!");
		
		ctxt.close();
		
		
	}

}
