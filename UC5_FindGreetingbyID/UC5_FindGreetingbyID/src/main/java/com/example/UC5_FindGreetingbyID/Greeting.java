package com.example.UC5_FindGreetingbyID;

import jakarta.persistence.Entity;

@Entity // This maps the java objects to the DB table
public class Greeting{

    // Encapsulated attributes of the class
    private Long id;
    private String message;

    // Constructor of the class
    public Greeting(String message){
        this.message = message;
    }

    // Getters and setters
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
