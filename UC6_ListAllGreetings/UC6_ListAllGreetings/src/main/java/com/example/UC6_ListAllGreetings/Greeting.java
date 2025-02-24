package com.example.UC6_ListAllGreetings;

import jakarta.persistence.Entity;

@Entity // Maps the Java objects to the DB table
public class Greeting {
    // Encapsulated Attributes of the class
    private Long id;
    private String message;

    // Default constructor (needed by JPA)
    public Greeting() {
    }
    // Constructor of the class
    public Greeting(String message){
        this.message = message;
    }

    // Getter setters
    public Long getId(){
        return id;
    }
    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }
}

