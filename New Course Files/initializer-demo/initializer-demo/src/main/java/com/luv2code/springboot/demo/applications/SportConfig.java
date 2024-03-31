package com.luv2code.springboot.demo.applications;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class SportConfig {
    // No explicit bean definitions required as we are using component scanning
}
