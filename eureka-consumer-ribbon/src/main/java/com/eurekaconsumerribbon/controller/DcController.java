package com.eurekaconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DcController {
	
	@Autowired
    RestTemplate restTemplate;
	
	@GetMapping("/consumer")
	@HystrixCommand(fallbackMethod = "hiError")
    public String dc() {
		return restTemplate.getForObject("http://eureka-client/dc", String.class);
	}
	
	public String hiError() {
        return "error!";
    }
}
