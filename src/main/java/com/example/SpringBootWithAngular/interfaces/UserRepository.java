package com.example.SpringBootWithAngular.interfaces;
 
import org.springframework.data.repository.CrudRepository;

import com.example.SpringBootWithAngular.entities.Users;

//@Repository //No es necesario, si se lee la documentación de CrudRepository se puede
// ver que tiene la etiqueta @NoRepositoryBean (es una clase intermedia para añadir funcionalidad)
public interface UserRepository extends CrudRepository<Users, Long>{}