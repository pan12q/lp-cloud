package com.lp.cloud.feign.controller;

import com.lp.cloud.feign.consumer.RegisterFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8866/testInfo
 * @author liupan
 * @version V1.0
 * @date 2018/10/27 15:33
 */
@RestController
public class RegisterFeignController {
	@Autowired
	private RegisterFeign registerFeign;

	@RequestMapping(value = "/testInfo", method = RequestMethod.GET)
	public String testInfo() {
		return registerFeign.info();
	}
}
