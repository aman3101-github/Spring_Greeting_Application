package com.example.UC8_DeleteGreeting;

import jakarta.persistence.*;

@Entity
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;

    // Default Constructor
    public Greeting() {}

    // Parameterized Constructor
    public Greeting(String message) {
        this.message = message;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
