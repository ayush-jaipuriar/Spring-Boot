package com.luv2code.springboot.demo.applications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ayush.service.FortuneService;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    @Autowired
    public CricketCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        System.out.println("Inside CricketCoach constructor");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 mins";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct
    public void initializeCoach() {
        System.out.println("Entered initializeCoach method in CricketCoach class");
    }

    @PreDestroy
    public void cleanupCoach() {
        System.out.println("Entered cleanupCoach method in CricketCoach class");
    }
}
