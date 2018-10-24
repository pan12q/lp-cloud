package com.lp.cloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * http://localhost:8865/hi?name=123
 * @author liupan
 * @date 2018-10-24
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class LpCloudRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(LpCloudRibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
