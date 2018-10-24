package com.lp.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * http://localhost:8864/register/info
 * @author liupan
 * @date 2018-10-23
 */
@EnableZuulProxy
@SpringCloudApplication
public class LpCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LpCloudGatewayApplication.class, args);
	}
}
