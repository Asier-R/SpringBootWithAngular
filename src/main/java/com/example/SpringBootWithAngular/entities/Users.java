package com.example.SpringBootWithAngular.entities;

import jakarta.persistence.*;

// La palabra "User" está reservada en el estandar SQL y es una clave en H2
// Utilizar esta palabra clave resulta en error de H2 y SQL al arrancar la aplicación
// Por esta se razón se ha optado por la variante en plurar "Users"
@Entity
public class Users {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    
    // standard constructors / setters / getters / toString
    public Users() {
        this.name = "";
        this.email = "";
    }
    
    public Users(String name, String email) {
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
        return "Users{" + "id=" + id + ", name=" + name + ", email=" + email + '}';
    }
}
