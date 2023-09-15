package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoConfigurationController {
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/demo")
    public demoConfiguration retriveLimitsFromConfigurations()  
    {  
        //return new demoConfiguration(1000, 1);
        return new demoConfiguration(configuration.getMaximum(), configuration.getMinimum());    
    } 

}
