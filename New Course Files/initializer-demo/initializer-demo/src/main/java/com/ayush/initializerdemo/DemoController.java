package com.ayush.initializerdemo;

// Import necessary annotations and classes for Spring Boot web application development
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Define the DemoController class as a REST controller
@RestController
public class DemoController {

    // Define a GET mapping for the "/workout" endpoint
    @GetMapping("/workout")
    // Method to handle requests to the "/workout" endpoint
    // It retrieves the student's name from the application properties and returns it as a response
    public String getMethodName(@Value("${student.name}") String name) {
        // Return the student's name as a string
        return new String(name);
    }
}