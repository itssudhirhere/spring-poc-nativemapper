package com.example.poc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.poc.entity.Department;
import com.example.poc.entity.Employee;

@Repository
public interface DepartmentRepo  extends CrudRepository<Department, Long> {

	
}
