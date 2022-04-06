package com.robo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.robo")
public class RoboApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoboApplication.class, args);
	}

}
