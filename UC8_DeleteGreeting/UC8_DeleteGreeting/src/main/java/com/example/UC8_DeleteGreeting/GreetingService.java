package com.example.UC8_DeleteGreeting;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;

    // Constructor-based Dependency Injection
    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    // Method to delete a Greeting by ID
    public void deleteGreetingById(Long id) {
        if (greetingRepository.existsById(id)) {
            greetingRepository.deleteById(id);
        } else {
            throw new RuntimeException("Greeting not found with ID: " + id);
        }
    }
}
