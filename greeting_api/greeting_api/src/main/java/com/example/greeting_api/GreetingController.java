package com.example.greeting_api;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
    @RequestMapping("/api/greeting")
public class GreetingController {

    // GET request to return a simple greeting
    @GetMapping
    public Map<String, String> getGreeting() {
        Map<String, String> message = new HashMap<>();
        message.put("message", "Hello, this is a .");
        return message;
    }

    // POST request accepts a name and returns a greeting
    @PostMapping
    public Map<String, String> postGreeting(@RequestBody Map<String, String> requestBody) {
        String name = requestBody.get("name");
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello" + name);
        return response;
    }

    // PUT request updates the greeting message
    @PutMapping
    public Map<String, String> putGreeting(@RequestBody Map<String, String> requestBody) {
        String name = requestBody.get("name");
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello again" + name);
        return response;
    }

    // DELETE request to delete the greeting
    @DeleteMapping
    public Map<String, String>  deleteGreeting(@RequestBody Map<String, String> requestBody){
        String name = requestBody.get("name");
        Map<String, String> response = new HashMap<>();
        response.put("message", "Greeting deleted for " + name);
        return response;
    }

}
