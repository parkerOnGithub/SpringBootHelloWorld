package com.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	String s = 
	s = "#################################################################################\n"
			+ "##									       ##\n"
			+ "##			      Welcome to Spring Boot    		       ##\n"
			+ "##								               ##\n"
			+ "#################################################################################";
	
	@RequestMapping("/")
	public String hello() {
		return s;
	}
}
