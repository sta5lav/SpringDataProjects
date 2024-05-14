package com.example.springdataprojects.controller;


import com.example.springdataprojects.dto.EmployeeProjection;
import com.example.springdataprojects.model.Employee;
import com.example.springdataprojects.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeProjection> getEmployeeInfo(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployee(id));
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployes() {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAllEmployes());
    }

    @PostMapping
    public ResponseEntity<Void> addEmployee(@RequestBody Employee employee) {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.addEmployee(employee));
    }

    @PutMapping
    public ResponseEntity<Void> updateEmployee(@RequestBody Employee employee) {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.updateEmployee(employee));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.deleteEmployee(id));
    }






}
