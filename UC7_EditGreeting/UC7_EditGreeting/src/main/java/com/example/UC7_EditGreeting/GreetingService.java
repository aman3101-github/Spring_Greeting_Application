package com.example.UC7_EditGreeting;


import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {
    // Dependency Injection
    private final GreetingRepository greetingRepository;

    // Constructor based DI
    public GreetingService(GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }

    // Method to edit the greeting
    public Greeting editGreeting(Long id, String message){
        Optional<Greeting> optionalGreeting = greetingRepository.findById(id);
        if(optionalGreeting.isPresent()){
            Greeting greeting = optionalGreeting.get();
            greeting.setMessage("Greeting is updated.");
            return greetingRepository.save(greeting);
        }
        else {
            throw new RuntimeException("Greeting not found with ID: " + id);
        }
    }
}
