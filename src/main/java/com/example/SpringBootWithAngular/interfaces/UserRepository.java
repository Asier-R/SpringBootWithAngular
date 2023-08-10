package com.example.SpringBootWithAngular.interfaces;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootWithAngular.entities.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Long>{}