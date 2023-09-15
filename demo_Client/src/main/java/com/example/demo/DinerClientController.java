package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;


@EnableFeignClients
@RestController
public class DinerClientController {

	private static final Logger logger = LoggerFactory.getLogger(DinerClientController.class);

	@Autowired
	private DinerClient dinerClient;


	@RequestMapping(path = "/dinerclient/mydiner", method=RequestMethod.POST)
	public TrivialClientResponse findDinerStatus(@RequestBody TrivialClientRequest request) {
		logger.info("findDinerStatus::day=" + request.getDay());
		return dinerClient.testDay(request);
	}
	
}