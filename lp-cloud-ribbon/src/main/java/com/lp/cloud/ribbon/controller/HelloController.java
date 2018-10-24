package com.lp.cloud.ribbon.controller;

import com.lp.cloud.ribbon.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liupan
 * @version V1.0
 * @date 2018/10/24 11:58
 */
@RestController
public class HelloController {
	@Autowired
	IHelloService helloService;

	@RequestMapping(value = "/hi")
	public String hi(@RequestParam String name){
		return helloService.hiService(name);
	}

}
