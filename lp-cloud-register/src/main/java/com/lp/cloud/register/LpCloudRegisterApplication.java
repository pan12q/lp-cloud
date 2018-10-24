package com.lp.cloud.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class LpCloudRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(LpCloudRegisterApplication.class, args);
	}

	@RequestMapping(value = "/info" ,method = RequestMethod.GET)
	public String info() {
		return "hello I am is spring-serviceA";
	}

}
