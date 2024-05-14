package com.example.springdataprojects.service;

import com.example.springdataprojects.dto.EmployeeProjection;
import com.example.springdataprojects.model.Employee;

import java.util.List;

public interface EmployeeService {

    EmployeeProjection getEmployee(Long id);

    List<Employee> getAllEmployes();

    Employee addEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Long id);
}
