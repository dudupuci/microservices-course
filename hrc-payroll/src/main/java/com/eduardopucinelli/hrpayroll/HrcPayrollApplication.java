package com.eduardopucinelli.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HrcPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrcPayrollApplication.class, args);
	}

}
