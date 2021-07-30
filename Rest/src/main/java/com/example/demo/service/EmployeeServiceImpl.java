package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.IEmployeeDao;
import com.example.demo.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDao empDao;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empDao.findAll();
	}

	@Override
	public Employee getEmpById(int empId) {
		// TODO Auto-generated method stub
		Optional<Employee> opt = empDao.findById(empId);
		return opt.get();           
		
	}

	@Override
	public Employee getEmpByName(String empName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		empDao.save(employee);
		return null;
	}

	@Override
	public void deleteEmpById(int empId) {
		// TODO Auto-generated method stub
		empDao.deleteById(empId);
		
	}

	@Override
	public Employee deleteEmpByName(String empName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
	//Find employee
		Optional<Employee> opt = empDao.findById(employee.getEmpId());
		//Update employee details
		if(opt.isPresent()) {
			Employee dbEmp = opt.get();
			dbEmp.setFirstName(employee.getFirstName());
			dbEmp.setLastName(employee.getLastName());
			dbEmp.setContactNo(employee.getContactNo());
			dbEmp.setEmail(employee.getEmail());
			dbEmp.setEmpId(employee.getEmpId());
		//save
			empDao.save(dbEmp);
		}
		
	//return employee or dbEmp
		return employee;
	}

	@Override
	public Employee updateEmpFirstName(int empId, String fName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmpLastName(String fname, String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmpEmail(int id, String email) {
		// TODO Auto-generated method stub
		//Find employee
				Optional<Employee> opt = empDao.findById(id);
				Employee dbEmp = opt.get();
				//Update employee details
				if(opt.isPresent()) {
					dbEmp.setEmail(email);
					empDao.save(dbEmp);
				}
		
		return dbEmp;
	}
	
	
}

	