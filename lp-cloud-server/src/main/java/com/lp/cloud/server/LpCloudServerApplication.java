package com.lp.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LpCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LpCloudServerApplication.class, args);
	}
}
