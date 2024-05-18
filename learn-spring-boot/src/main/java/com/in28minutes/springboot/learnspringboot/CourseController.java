package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/courses

@RestController  //@RestController is a Spring Boot annotation that makes a class handle RESTful web requests, returning JSON or XML responses directly.
public class CourseController {
	
	@RequestMapping("/courses")  // http://localhost:8080/courses when you visit here it shows the couses in JSON
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				
				new Course(1,"Learn AWS", "in28minutes"),
				new Course(2,"Learn DevOps", "in28minutes")
				);
	}

}
