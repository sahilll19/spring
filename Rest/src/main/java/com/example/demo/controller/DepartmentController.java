package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Department;
import com.example.demo.service.IDepartmentService;

public class DepartmentController {
	
	@Autowired
	IDepartmentService deptServ;
	
	//Get All Departments
	@GetMapping("/department/all")
	public List<Department> getAllDepartments(){
		return deptServ.getAllDepartments();
	}
	

}
