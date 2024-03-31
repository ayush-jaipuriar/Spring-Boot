package com.luv2code.springboot.demo.applications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		// Run the Spring application and get the application context
        ApplicationContext context = SpringApplication.run(MycoolappApplication.class, args);

        // Retrieve the bean from the Spring container
        Coach coach = context.getBean("cricketCoach", Coach.class);

        // Use the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(((CricketCoach) coach).getDailyFortune());
	}

}
