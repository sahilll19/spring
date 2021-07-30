package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

	
    @Entity
    @Getter
    @Setter
    @NoArgsConstructor
    @ToString
    public class Department {
	
	@Id
	private long deptId;
	private String deptName;
	private String hodName;
	private List<Employee> employees = new ArrayList<>();

//	Department(){} 
//	
//	public long getDeptId() {
//		return deptId;
//	}
//	
//	public void setDeptId(int deptId) {
//		this.deptId = deptId;
//	}
//	public String getDeptName() {
//		return deptName;
//	}
//	public void setDeptName(String deptName) {
//		this.deptName = deptName;
//	}
//	public String getHodName() {
//		return hodName;
//	}
//	public void setHodName(String hodName) {
//		this.hodName = hodName;
//	}
//	public List<Employee> getEmployees() {
//		return employees;
//	}
//	public void setEmployees(List<Employee> employees) {
//		this.employees = employees;
//	}
//	
//	@Override
//	public String toString() {
//		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", hodName=" + hodName + ", employees="
//				+ employees + "]";
//	}
//	

}
