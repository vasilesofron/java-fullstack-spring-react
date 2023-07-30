package com.javapractice.JavaCRUDfullstack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity     //Generate User table when we connect the application with the MySQL Database
public class User {

    @Id     //Specifying the primary key
    @GeneratedValue     //Specification of generation strategies for the values of primary keys
    private Long id;
    private String username;
    private String name;
    private String email;

    // Auto Generated the getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
