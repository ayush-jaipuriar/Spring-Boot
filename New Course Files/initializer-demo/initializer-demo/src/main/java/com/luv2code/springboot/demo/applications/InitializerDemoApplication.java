package com.luv2code.springboot.demo.applications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class InitializerDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");

		// // Load the Spring Configuration
		// AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		// context.register(InitializerDemoApplication.class);
		// context.refresh(); // Refresh the context

		// // Retrieve the bean from the Spring Container
		// Coach coach = context.getBean("cricketCoach", Coach.class);

		// // Use the bean
		// System.out.println(coach.getDailyWorkout());
		// System.out.println(((CricketCoach) coach).getDailyFortune());

		SpringApplication.run(InitializerDemoApplication.class, args);
	}

}
