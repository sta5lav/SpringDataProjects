package com.example.springdataprojects.service;


import com.example.springdataprojects.dto.EmployeeProjection;
import com.example.springdataprojects.model.Employee;
import com.example.springdataprojects.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeProjection getEmployee(Long id) {
        return employeeRepository.findWithInterfaceProjectionWithoutQueryById(id);
    }

    @Override
    public List<Employee> getAllEmployes() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
