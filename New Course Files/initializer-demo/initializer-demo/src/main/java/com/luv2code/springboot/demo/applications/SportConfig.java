package com.luv2code.springboot.demo.applications;

// Import necessary Spring Boot annotations for configuration and component scanning
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// Define a configuration class for the application
@Configuration
public class SportConfig {

    // Specify the base package to scan for components
    @ComponentScan("com.ayush")

    // Load properties from the specified file
    @PropertySource("classpath:application.properties")

    // No explicit bean definitions are required as we are using component scanning
    // Spring will automatically detect and register beans in the specified package
}