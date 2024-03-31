package com.ayush.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyService implements FortuneService{
    public LazyService() {
        System.out.println("Initializing LazyService class");
    }

    public void doSomething() {
        System.out.println("Entered doSomething method in LazyService");
    }

    @Override
    public String getFortune() {
        return "Will give the fortune later, let me sleep";
    }
}
