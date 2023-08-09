package com.example.SpringBootWithAngular.entities;

import jakarta.persistence.*;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    
    // standard constructors / setters / getters / toString
    public User() {
        this.name = "";
        this.email = "";
    }
    
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", email=" + email + '}';
    }
}
