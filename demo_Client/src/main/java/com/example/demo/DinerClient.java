package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;


@Configuration
@EnableFeignClients
//@EnableDiscoveryClient
public class DinerClient {
 
    @Autowired
    private TheClient theClient;

    @FeignClient(name = "diner", url="http://localhost:8081")
    interface TheClient {
 
        @RequestMapping(path = "/diner/isopen", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
        @ResponseBody
	TrivialClientResponse isOpen(@RequestBody TrivialClientRequest request);
    }


    	public TrivialClientResponse testDay(TrivialClientRequest request) {
		return theClient.isOpen(request);
	}

}