package com.eduardopucinelli.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//eureka ja balanceia a carga, não precisa de ribbon
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class HrcPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrcPayrollApplication.class, args);
	}

}
