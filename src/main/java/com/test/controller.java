package com.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	
	@GetMapping(value = "/name/{SerNo}")
	public String abc(@PathVariable String SerNo) {
		 
		return "Hello " + SerNo;
	}
}
