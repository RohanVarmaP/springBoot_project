package com.rohan.springBoot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext content=SpringApplication.run(SpringBootProjectApplication.class, args);
	}

}