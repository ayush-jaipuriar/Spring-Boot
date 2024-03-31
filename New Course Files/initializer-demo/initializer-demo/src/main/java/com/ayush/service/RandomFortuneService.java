package com.ayush.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class RandomFortuneService implements FortuneService {
    private String[] fortunes = {
        "Today is your lucky day!",
        "You will have a great day!",
        "Good luck is coming your way!"
    };

    private Random random = new Random();

    @Override
    public String getFortune() {
        System.out.println("Entered getFortune method inside RandomFortuneService");
        int randomIndex = random.nextInt(fortunes.length);
        return fortunes[randomIndex];
    }
}
