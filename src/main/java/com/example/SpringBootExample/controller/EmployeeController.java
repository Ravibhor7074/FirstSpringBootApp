package com.example.SpringBootExample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootExample.Entity.Employee;
import com.example.SpringBootExample.service.EmployeeService;

@RestController
@RequestMapping("employee/")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp) {
		Employee response = employeeService.saveEmployee(emp);
		return new ResponseEntity<Employee>(response, HttpStatus.CREATED);
	}

	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
		Employee response = employeeService.getEmployeeById(id);
		return new ResponseEntity<Employee>(response, HttpStatus.OK);
	}

	@GetMapping("all")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee> response = employeeService.getAllEmployee();
		return new ResponseEntity<List<Employee>>(response, HttpStatus.OK);

	}
	
	@GetMapping("name/{name}")
	public ResponseEntity<Employee> getEmployeeByName(@PathVariable String name) {
		Employee response = employeeService.getEmployeeByName(name);
		return new ResponseEntity<Employee>(response, HttpStatus.OK);

	}
	
	@GetMapping("findby/{id}/{name}")
	public ResponseEntity<Employee> getEmployeeByIdandName(@PathVariable int id, @PathVariable String name) throws Exception {
		Employee response = employeeService.getEmployeeByIdAndName(id, name);
		if(response!=null) {
			return new ResponseEntity<Employee>(response, HttpStatus.OK);
		}else {
			throw new Exception("No record found");
		}
		

	}
}
