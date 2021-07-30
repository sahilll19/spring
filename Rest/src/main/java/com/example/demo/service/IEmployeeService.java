package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface IEmployeeService {
	 
	List<Employee> getAllEmployees();
	Employee getEmpById(int empId);
	Employee getEmpByName(String empName);
	
	Employee addEmployee(Employee employee);
	void deleteEmpById(int empId);
	Employee deleteEmpByName(String empName);
	
	Employee updateEmployee(Employee employee);
	Employee updateEmpFirstName(int empId, String fName);
	Employee updateEmpLastName(String fname, String firstName);
	
	Employee updateEmpEmail(int id, String email);
	
	
	

}
