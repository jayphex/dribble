package com.dribble.summerproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.dribble.summerproject")
public class SPApplication {

	public static void main(String[] args) {
		SpringApplication.run(SPApplication.class, args);
	}

}
