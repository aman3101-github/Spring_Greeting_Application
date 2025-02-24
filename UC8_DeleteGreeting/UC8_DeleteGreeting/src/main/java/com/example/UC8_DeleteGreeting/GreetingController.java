package com.example.UC8_DeleteGreeting;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController {
    private final GreetingService greetingService;

    // Constructor-based Dependency Injection
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // DELETE API to delete a Greeting by ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteGreeting(@PathVariable Long id) {
        greetingService.deleteGreetingById(id);
        return ResponseEntity.ok("Greeting deleted successfully!");
    }
}
