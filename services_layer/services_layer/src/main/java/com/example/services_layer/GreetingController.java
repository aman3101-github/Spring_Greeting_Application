package com.example.services_layer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/greeting")
public class GreetingController {

    // Dependency Injection
    private final GreetingService greetingService;

    // Injecting the Service Layer
    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    // Handling APIs
    @GetMapping("/hello")
    public String getGreeting(){
        // Delegating the service to service layer
        return GreetingService.getGreeting();
    }
}
