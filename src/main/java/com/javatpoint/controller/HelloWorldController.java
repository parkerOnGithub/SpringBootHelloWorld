package com.javatpoint.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
	
	@RequestMapping("/welcome")
	public String hello() {
		return "###############################		Welcome to Spring Boot		###############################";
	}
}
