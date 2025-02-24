package com.example.UC3_GreetingWithUserName;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController{

    // Dependency Injection
    private final GreetingService greetingService;

    // Injecting the service layer
    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    // REST API Handling by the controller
    @PostMapping("/message")
    public String getGreeting(@RequestBody UserDTO user){
            return GreetingService.getGreeting(user);
    }
}
