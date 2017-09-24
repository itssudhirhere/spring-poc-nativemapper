package com.example.poc.dto;

import javax.persistence.MappedSuperclass;

 
public class EmpDto {

	Long empId;
	String empName;
	Long depId;
	String depName;
	
	
	public EmpDto(Long empId, String empName, Long depId, String depName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.depId = depId;
		this.depName = depName;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Long getDepId() {
		return depId;
	}
	public void setDepId(Long depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	
	
	
	
	
}
