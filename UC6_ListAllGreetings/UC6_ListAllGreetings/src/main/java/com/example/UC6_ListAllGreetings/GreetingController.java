package com.example.UC6_ListAllGreetings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController {

    // Dependency Injection
    private final GreetingService greetingService;

    // Constructor based DI
    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    // Handle the REST API request to list all the greetings
    @GetMapping("/listgreetings")
    public List<Greeting> getAllGreetings(){
            return greetingService.findAllGreetings();
    }

}
