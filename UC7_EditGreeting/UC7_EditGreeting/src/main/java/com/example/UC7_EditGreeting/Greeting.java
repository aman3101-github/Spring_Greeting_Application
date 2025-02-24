package com.example.UC7_EditGreeting;

import jakarta.persistence.*;
import org.thymeleaf.standard.inline.StandardTextInliner;

@Entity // Map the java objects to DB table
public class Greeting {

    // Encapsulated Attributes of the class
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String message;

    // Constructor Default (JPA requires)
    public Greeting(){

    }
    // Parameterized Constructor
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
