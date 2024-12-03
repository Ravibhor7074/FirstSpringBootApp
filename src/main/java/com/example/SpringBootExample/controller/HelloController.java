package com.example.SpringBootExample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	public String getWelcome() {
		return "Welcome";
	}
	
	@PostMapping(value = "/post")
	public ResponseEntity<?> saveEmployee() {
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
		
}
