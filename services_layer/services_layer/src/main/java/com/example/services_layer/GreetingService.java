package com.example.services_layer;

import org.springframework.stereotype.Service;

// Service layer to follow Service Layer Architecture,
// the JSON is not directly returned but is first delegated to the Service layer
// Business logic is encapsulated inside the service layer and REST API in the controller
// for the separation of concerns

@Service
public class GreetingService {

    // Method to return a simple greeting message
    public static String getGreeting() {
        return "Hello World!";

    }
}