package com.ayush.service;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    public HappyFortuneService() {
        System.out.println("Initializing HappyFortuneSerice class");
    }

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

}
