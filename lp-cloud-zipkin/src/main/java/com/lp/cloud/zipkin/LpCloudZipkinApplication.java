package com.lp.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class LpCloudZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(LpCloudZipkinApplication.class, args);
	}
}
