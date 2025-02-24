package com.example.UC7_EditGreeting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greeting")

public class GreetingController {

    // Dependency Injection
    private final GreetingService greetingService;

    // Constructor based DI
    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    // Handling the REST APIs
    @PutMapping("/update/{id}")
    public Greeting putGreeting(@PathVariable Long id, String message){
        return greetingService.editGreeting(id, message);
    }
}
