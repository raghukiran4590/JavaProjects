package com.gfg.springdatajpa.example.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


// It should be marked as Entity,
@Entity
public class UserRecord {

    @Id // For Primary key
    private int id;
    private String name;
    private String email;
    private String gender;
    private int numberOfPosts;

    // Getter and setter methods
    public String getGender() { return gender; }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public int getNumberOfPosts() { return numberOfPosts; }

    public void setNumberOfPosts(int numberOfPosts)
    {
        this.numberOfPosts = numberOfPosts;
    }

    // default constructor is mandatory to specify
    public UserRecord() {}

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
