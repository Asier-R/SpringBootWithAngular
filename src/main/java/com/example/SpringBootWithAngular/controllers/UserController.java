package com.example.SpringBootWithAngular.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.SpringBootWithAngular.interfaces.UserRepository;
import com.example.SpringBootWithAngular.entities.User;

@RestController
@CrossOrigin(origins = {"${address.front}"}) //Ubicación del front
public class UserController {

    // standard constructors
    @Autowired
    private  UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
