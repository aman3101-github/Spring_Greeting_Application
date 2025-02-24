package com.example.UC3_GreetingWithUserName;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public static String getGreeting(UserDTO user){
        if(user.getFirstName() != null && user.getLastName() != null) {
            return "Hello, " + user.getFirstName() + " " + user.getLastName();
        }
        else if (user.getFirstName() != null) {
            return "Hello, " + user.getFirstName();
        }
        else if (user.getLastName() != null) {
            return "Hello, " + user.getLastName();
        }
        else {
            return "Hello World!";
        }
    }
}
