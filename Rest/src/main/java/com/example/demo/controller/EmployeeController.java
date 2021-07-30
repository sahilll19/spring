package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	IEmployeeService empServ;
	
	
	//get all employees - Get
	@GetMapping("/employee/all")
	public List<Employee> getAllEmployees() {
		return empServ.getAllEmployees();
		}
	
	//get employee based on id 
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id")int id) {
		return empServ.getEmpById(id);
	}
	//add employee
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return empServ.addEmployee(employee);
		
	}
	//del employee based on id - delete
	@DeleteMapping("/employee/{id}")
	public void deleteEmployeeById(@PathVariable("id") int id) {
		empServ.deleteEmpById(id);
		
	}
	
	//delete employee based on name - delete
	
	//update employee - Put
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return empServ.updateEmployee(emp);
	}
	//update emp first name / last name - Patch
	
	//update employee email / contactno - Patch
	@PatchMapping("/employee/{id}")
	public Employee updateEmpEmail(@PathVariable("id") int id, @RequestBody String email) {
		return empServ.updateEmpEmail(id, email);
	
	
}}
