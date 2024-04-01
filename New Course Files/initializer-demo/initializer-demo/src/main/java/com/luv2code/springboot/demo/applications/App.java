package com.luv2code.springboot.demo.applications;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ayush.service.FortuneService;
import com.ayush.service.LazyService;

import DAO.ActorDAO;
import entity.Actor;

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

    @Bean
    public CommandLineRunner commandLineRunner(ActorDAO actorDAO) {
        return runner -> createActor(actorDAO);
    }

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
