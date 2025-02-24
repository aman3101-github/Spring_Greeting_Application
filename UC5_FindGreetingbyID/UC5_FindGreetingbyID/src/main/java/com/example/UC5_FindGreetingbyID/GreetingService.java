package com.example.UC5_FindGreetingbyID;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service // This handles the business logic
public class GreetingService {
    // Dependency Injection
    private final GreetingRepository greetingRepository;

    // Constructor based DI
    public GreetingService(GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }
    // Method to find the greeting by the ID
    public Greeting findGreetingById(Long id){
        Optional<Greeting> greeting = greetingRepository.findById(id);
    return greeting.orElseThrow(()-> new RuntimeException("Greeting not found!"));
    }

}
