package com.example.SpringBootMySQLApp.models;

import jakarta.persistence.*;


@Entity
// Adding the table name
@Table(name = "Student")
public class StudentInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollno;
    private String name;

    public StudentInformation() {}

    public StudentInformation(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() { return rollno; }

    public void setRollno(int rollno)
    {
        this.rollno = rollno;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

}

