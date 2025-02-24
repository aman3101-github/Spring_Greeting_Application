package com.example.UC3_GreetingWithUserName;

//A DTO (Data Transfer Object) is a simple Java object
// that is used to transfer data between different layers of an application.

public class UserDTO {
    // Encapsulated attributes of the DTO class
    private String firstName;
    private String lastName;


    // Default Constructor of DTO
    public UserDTO(){}

    // Parameterized Constructor of DTO
    public UserDTO(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and setters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }


}
