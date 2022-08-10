package com.eduardopucinelli.hrceurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HrcEurekaServerApplication  {

	
	public static void main(String[] args) {
		SpringApplication.run(HrcEurekaServerApplication.class, args);
	}

}