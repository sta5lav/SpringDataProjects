package com.example.springdataprojects.repository;

import com.example.springdataprojects.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {



}
