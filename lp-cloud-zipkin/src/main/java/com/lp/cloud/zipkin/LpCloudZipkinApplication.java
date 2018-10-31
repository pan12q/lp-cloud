package com.lp.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class LpCloudZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(LpCloudZipkinApplication.class, args);
	}
}
