package com.example.springdataprojects.repository;

import com.example.springdataprojects.dto.EmployeeProjection;
import com.example.springdataprojects.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    EmployeeProjection findWithInterfaceProjectionWithoutQueryById(Long id);

    List<Employee> findAll();
}
