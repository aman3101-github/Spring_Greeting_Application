package com.example.UC4_Save.Greeting.in.Repository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/greeting")
public class GreetingController {

    // Dependency Injection
    private final GreetingService greetingService;

    // Constructor based DI

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // Handling APIs
    @PostMapping("/save")
    public  Greeting getGreeting(@RequestParam String message){
        return greetingService.saveGreeting(message);
    }
}

