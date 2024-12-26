package com.example.SpringBootExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootExample.Entity.DataDTO;
import com.example.SpringBootExample.service.ThirdPartApi;

/**
 * @author rabhor
 *
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private ThirdPartApi thirdPartApi;

	/**
	 * @return
	 */
	@GetMapping(value = "/msg")
	public String getMessage() {
		return "hello";
	}

	/**
	 * @return
	 */
	@GetMapping(value = "/api")
	public ResponseEntity<DataDTO> getWelcome() {
		DataDTO response = thirdPartApi.getThirdPartApi();
		return new ResponseEntity<DataDTO>(response, HttpStatus.OK);
	}

	/**
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/api/{id}")
	public ResponseEntity<DataDTO> getApiById(@PathVariable int id) {
		DataDTO response = thirdPartApi.getApiById(id);
		return new ResponseEntity<DataDTO>(response, HttpStatus.OK);
	}

	/**
	 * @return
	 */
	@PostMapping(value = "/post")
	public ResponseEntity<?> saveEmployee() {
		return new ResponseEntity<String>(HttpStatus.OK);
	}

}
