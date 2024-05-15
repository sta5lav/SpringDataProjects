package com.example.springdataprojects.service;

import com.example.springdataprojects.dto.EmployeeProjection;
import com.example.springdataprojects.model.Employee;

import java.util.List;

public interface EmployeeService {

    EmployeeProjection getEmployee(Long id);

    List<Employee> getAllEmployees();

    boolean addEmployee(Employee employee);

    boolean updateEmployee(Employee employee);

    boolean deleteEmployee(Long id);
}
