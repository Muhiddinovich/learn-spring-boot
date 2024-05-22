package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/courses

@RestController  //@RestController is a Spring Boot annotation that makes a class handle RESTful web requests, returning JSON or XML responses directly.
public class CurrencyConfigurationController {
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency-configuration")  // http://localhost:8080/courses when you visit here it shows the /currency-configuration in JSON
	public CurrencyServiceConfiguration retrieveAllCourses(){
		return configuration;
	}

}
