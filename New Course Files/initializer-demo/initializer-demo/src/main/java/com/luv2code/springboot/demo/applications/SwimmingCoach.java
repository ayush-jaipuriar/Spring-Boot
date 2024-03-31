package com.luv2code.springboot.demo.applications;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach{
    @Value("${coach.name}")
    private String coachName;
    @Value("${coach.email}")
    private String coachEmail;

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meteres as a warm up";
    }

    public String getCoachInfo() {
        return "Coach: " + coachName + ", Email: " + coachEmail;
    }

}
