package com.example.SpringBootMySQLApp;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @Version
    Long version;

    protected Long getVersion() { return version; }

    public User() {

    }

    User(int id, String name, Long version) {
        this.id = id;
        this.name = name;
        this.version = version;
    }
}
