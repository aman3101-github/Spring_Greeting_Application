package com.example.UC5_FindGreetingbyID;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/greeting")

public class GreetingController {

    // Dependency Injection
    private final GreetingService greetingService;

    // Constructor based DI
    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    // Handling the REST API
    @GetMapping("/{id}")
    // Method to get the greeting by id
    public Greeting getGreetingById(@PathVariable Long id ){
    return greetingService.findGreetingById(id);
    }
}