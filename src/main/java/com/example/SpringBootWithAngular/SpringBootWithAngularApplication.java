package com.example.SpringBootWithAngular;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.SpringBootWithAngular.entities.Users;
import com.example.SpringBootWithAngular.interfaces.UserRepository;

@SpringBootApplication
public class SpringBootWithAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithAngularApplication.class, args);
	}
	
	@Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
                Users user = new Users(name, name.toLowerCase() + "@domain.com");
                userRepository.save(user);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }

}
