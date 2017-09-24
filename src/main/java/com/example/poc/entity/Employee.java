package com.example.poc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.ConstructorResult;
import javax.persistence.ColumnResult;
import javax.persistence.Table;


import com.example.poc.dto.EmpDto;



@Entity
@Table
@SqlResultSetMapping(name="joinData", 
classes = {
   @ConstructorResult(targetClass = EmpDto.class, 
    columns = {@ColumnResult(name="empId", type=Long.class), @ColumnResult(name="empName", type=String.class),
    			@ColumnResult(name="depId", type=Long.class), @ColumnResult(name="depName", type=String.class)})
    })
  
public class Employee {

	
	@Id
//	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name="empname")
	private String empName;
	@Column(name="address")
	private String address;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", address=" + address + "]";
	}
	
	
	
	
	
}
