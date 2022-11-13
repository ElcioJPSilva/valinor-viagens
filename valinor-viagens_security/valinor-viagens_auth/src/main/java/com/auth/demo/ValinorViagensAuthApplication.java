package com.auth.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan (basePackages = {"com.auth.model.entities"})
@EnableJpaRepositories (basePackages = {"com.auth.repositories"})
@ComponentScan (basePackages = {"com.auth.controllers", 
		"com.auth.services", 
		"com.auth.security"})
@SpringBootApplication
public class ValinorViagensAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValinorViagensAuthApplication.class, args);
	}

}
