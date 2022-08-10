package com.eduardopucinelli.hrceurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HrcEurekaSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrcEurekaSeverApplication.class, args);
	}

}
