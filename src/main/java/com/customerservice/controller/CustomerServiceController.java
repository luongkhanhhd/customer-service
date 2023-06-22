package com.customerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CustomerServiceController {
	
	@GetMapping(name = "/say", value = "/say")
	public String sayHello() {
		return "hello from customer service";
	}
}
