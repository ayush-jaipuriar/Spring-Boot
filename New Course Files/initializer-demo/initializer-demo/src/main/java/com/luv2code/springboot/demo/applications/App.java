package com.luv2code.springboot.demo.applications;

// Import necessary Spring Boot and other classes
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

// Import service and DAO classes
import com.ayush.service.FortuneService;
import com.ayush.service.LazyService;
import DAO.ActorDAO;
import entity.Actor;

// Main Spring Boot application class
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        // Run the Spring application and get the application context
        ApplicationContext context = SpringApplication.run(App.class, args);

        // Retrieve the bean from the Spring container
        Coach coach = context.getBean("cricketCoach", CricketCoach.class);

        // Use the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(((CricketCoach) coach).getDailyFortune());

        coach = context.getBean("swimmingCoach", SwimmingCoach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(((SwimmingCoach) coach).getCoachInfo());

        // Since the LazyService class is marked as @Lazy, it will get initialized now
        // instead of during Spring initialization like other beans
        FortuneService service = context.getBean("lazyService", LazyService.class);
        ((LazyService) service).doSomething();
    }

    // Define a CommandLineRunner bean that will be executed after the application context is loaded
    @Bean
    public CommandLineRunner commandLineRunner(ActorDAO actorDAO) {
        // Return a lambda function that will be executed when the application starts
        return runner -> createActor(actorDAO);
    }

    // Method to create and save an Actor object using the ActorDAO
    private void createActor(ActorDAO actorDAO) {
        Actor actor = new Actor();
        actor.setId(69);
        actor.setFirstName("Ayush");
        actor.setLastName("Jaipuiriar");
        actor.setLastUpdate(null);
        actorDAO.save(actor);

        System.out.println("Saved Actor ID : " + actor);
    }
}