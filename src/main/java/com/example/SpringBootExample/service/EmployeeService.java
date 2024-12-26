package com.example.SpringBootExample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootExample.Entity.Employee;
import com.example.SpringBootExample.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee emp) {
		 Employee response = employeeRepository.save(emp);
		 return response;
	}
	

	public List<Employee> getAllEmployee() {
		  List<Employee> response = employeeRepository.findAll();
		 return response;
	}
	
	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).get();
	}
	
	public Employee getEmployeeByName(String name) {
		return employeeRepository.findByName(name);
	}
	
	public Employee getEmployeeByIdAndName(int id,String name) {
		return employeeRepository.findByIdAndName(id, name);
	}
}
