package com.example.UC4_Save.Greeting.in.Repository;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    // Dependency Injection
    private final GreetingRepository greetingRepository;

    // Constructor based DI
    public GreetingService(GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }


    // Method to follow business logic to generate greeting
    public Greeting saveGreeting(String message) {
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);  // Saves in the database
    }
    }

