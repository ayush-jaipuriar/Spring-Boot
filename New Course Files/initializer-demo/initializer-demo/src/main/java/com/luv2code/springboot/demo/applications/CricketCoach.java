package com.luv2code.springboot.demo.applications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ayush.service.FortuneService;

@Component
public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    @Autowired
    public CricketCoach(FortuneService fortuneService) {
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
}
