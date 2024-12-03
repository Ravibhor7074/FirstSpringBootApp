package com.example.SpringBootExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping(value = "/msg")
	public String getMessage() {
		return "hello";
	}
	
	@GetMapping(value = "/welcome")
	public String getMessageWelcome() {
		return "Welcome to git";
	}

	@GetMapping(value = "/welcometojava")
	public String getMessageeWelcome() {
		return "Welcome to java";
	}
	
	@GetMapping(value = "/welcometojava")
	public String getMessageeeWelcome() {
		return "Welcome to java";
	}
	
	@GetMapping(value = "/java")
	public String getJava() {
		return "Welcome to java";
	}
	
}
