package com.lp.cloud.ribbon.service.impl;

import com.lp.cloud.ribbon.service.IHelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author liupan
 * @version V1.0
 * @date 2018/10/24 11:56
 */
@Service
public class HelloServiceImpl implements IHelloService {
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "hiError")
	@Override
	public String hiService(String name) {
		int i = 1/0;
		return restTemplate.getForObject("http://lp-cloud-register/info", String.class);
	}

	public String hiError(String name) {
		return "error";
	}

}
