package com.example.poc.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.poc.dto.EmpDto;
import com.example.poc.dto.EmpProj;
import com.example.poc.entity.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long> {

	@Query(value="select * from employee where id=?1",nativeQuery=true)
	Optional<Employee> findById(Long id);
	
	
	@Query(value="select e.empname as empName, d.depname from employee as e inner Join Department as d on e.id = d.id",nativeQuery=true)
	List<EmpProj> findById1();
	
	
}
