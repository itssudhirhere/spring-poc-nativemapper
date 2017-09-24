package com.example.poc.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.poc.dto.EmpDto;
import com.example.poc.dto.EmpProj;
import com.example.poc.entity.Department;
import com.example.poc.entity.Employee;
import com.example.poc.repository.DepartmentRepo;
import com.example.poc.repository.EmployeeRepo;

@Service
public class HomeService {

	@Autowired
	EmployeeRepo employeeRepo;
	
	@Autowired
	DepartmentRepo departmentRepo;
	
	@PersistenceContext
	  private EntityManager em;
	
	public void addRedcord() {
		Employee e1 = new Employee();
		e1.setId(1L);
		e1.setEmpName("sudhir1");
		e1.setAddress("noida");
		employeeRepo.save(e1);
		
		Employee e2 = new Employee();
		e2.setId(2L);
		e2.setEmpName("sudhir2");
		e2.setAddress("delhi");
		employeeRepo.save(e2);
		
		Employee e3 = new Employee();
		e3.setId(4L);
		e3.setEmpName("sudhir4");
		e3.setAddress("delhi-4");
		employeeRepo.save(e3);
		
		Department d1 = new Department();
		d1.setId(1L);
		d1.setDepName("technology-1");
		
		Department d2 = new Department();
		d2.setId(3L);
		d2.setDepName("technology-2");
		
		Department d3 = new Department();
		d3.setId(4L);
		d3.setDepName("technology-4");
		
		
		departmentRepo.save(d1);
		departmentRepo.save(d2);
		departmentRepo.save(d3);
		
	}
	
	public List<Employee> findAll(){
	
		return (List<Employee>) employeeRepo.findAll();
	}
	
	public Optional<Employee> findById() {
		System.out.println(departmentRepo.findAll());
		return employeeRepo.findById(1L);
	}
	public List<EmpProj> findById1() {
		return employeeRepo.findById1();
	}
	
	public List<EmpDto> getJoinData(){
		return em.createNativeQuery("select e.id as empId,e.empName as empName, d.id as depId, d.depName as depName from Employee e inner Join "
				+ "Department d on d.id = e.id", "joinData").getResultList();
		
	}

}
