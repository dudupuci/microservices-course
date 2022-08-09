package com.eduardopucinelli.hrworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrcWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrcWorkerApplication.class, args);
	}

}
