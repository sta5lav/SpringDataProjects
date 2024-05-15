package com.example.springdataprojects.service;


import com.example.springdataprojects.dto.EmployeeProjection;
import com.example.springdataprojects.model.Employee;
import com.example.springdataprojects.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeProjection getEmployee(Long id) {
        return employeeRepository.findWithInterfaceProjectionWithoutQueryById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public boolean addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return true;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        if (employeeRepository.existsById(employee.getId())) {
            employeeRepository.save(employee);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
