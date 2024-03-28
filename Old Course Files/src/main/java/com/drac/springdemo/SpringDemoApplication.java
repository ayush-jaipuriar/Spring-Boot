package com.drac.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
