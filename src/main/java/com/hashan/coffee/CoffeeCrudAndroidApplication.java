package com.hashan.coffee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoffeeCrudAndroidApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeCrudAndroidApplication.class, args);
		System.out.println("Coffee!!");
	}

}
