package com.example.SpringBootWithAngular.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.SpringBootWithAngular.interfaces.UserRepository;
import com.example.SpringBootWithAngular.entities.Users;

@RestController
//@CrossOrigin(origins = {"${address.front}"}) //Ubicación del front
@CrossOrigin(origins = {"http://localhost:4200"}) //Ubicación del front
public class UserController {

    // standard constructors
    @Autowired
    private  UserRepository userRepository;

    @GetMapping("/users")
    public List<Users> getUsers() {
        return (List<Users>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody Users user) {
        userRepository.save(user);
    }
}
