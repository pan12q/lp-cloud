package com.lp.cloud.feign.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author liupan
 * @version V1.0
 * @date 2018/10/27 15:28
 */
@FeignClient(value = "lp-cloud-register")
public interface RegisterFeign {

	@RequestMapping(value = "/info" ,method = RequestMethod.GET)
	String info();

}
