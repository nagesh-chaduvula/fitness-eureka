package com.server.fitnesseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer	// To act this spring boot microservices application as a Eureka server
public class FitnessEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitnessEurekaApplication.class, args);
	}

}
