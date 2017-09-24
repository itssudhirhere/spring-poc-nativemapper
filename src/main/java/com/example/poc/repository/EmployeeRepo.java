package com.example.poc.repository;

import com.example.poc.dto.EmpProj;
import com.example.poc.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long> {

    @Query(value = "select * from employee where id=?1", nativeQuery = true)
    Optional<Employee> findById(Long id);


    @Query(value = "select e.empName as empName, d.depName as depName from Employee e inner join Department as d on e.id = d.id", nativeQuery = false)
    List<EmpProj> findById1();


}
