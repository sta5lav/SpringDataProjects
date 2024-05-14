package com.example.springdataprojects.service;

import com.example.springdataprojects.dto.EmployeeProjection;
import com.example.springdataprojects.model.Employee;

import java.util.List;

public interface EmployeeService {

    EmployeeProjection getEmployee(Long id);

    List<Employee> getAllEmployes();

    void addEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(Long id);
}
