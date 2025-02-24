package com.example.UC6_ListAllGreetings;

import org.springframework.stereotype.Service;

import java.util.List;

@Service // Responsible for handling business logic
public class GreetingService {
    // Dependency Injection
    private final GreetingRepository greetingRepository;

    // Constructor based DI
    public GreetingService(GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }

    // Method to find all the greetings in the DB
    public List<Greeting> findAllGreetings(){
            return greetingRepository.findAll();
    }
}
