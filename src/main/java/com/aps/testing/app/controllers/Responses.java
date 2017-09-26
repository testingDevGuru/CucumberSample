package com.aps.testing.app.controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Responses {
	
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hello! You are on my page.";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "You are on about us page.";
	}
	
	@RequestMapping("/topics")
	public List<Topics> returnTopics(){
		
		return Arrays.asList(
				new Topics(1,"Spring","Spring Boot description"),
				new Topics(2,"Java","Java description"),
				new Topics(3,"JS","JS description")
				
				);
	}

}
