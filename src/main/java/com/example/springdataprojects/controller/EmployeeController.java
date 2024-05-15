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
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAllEmployees());
    }

    @PostMapping
    public ResponseEntity<Void> addEmployee(@RequestBody Employee employee) {
        return ResponseEntity.status(
                employeeService.addEmployee(employee) ?
                        HttpStatus.OK :
                        HttpStatus.BAD_REQUEST

        ).build();
    }

    @PutMapping
    public ResponseEntity<Void> updateEmployee(@RequestBody Employee employee) {
        return ResponseEntity.status(
                employeeService.updateEmployee(employee) ?
                        HttpStatus.OK :
                        HttpStatus.NOT_FOUND

        ).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        return ResponseEntity.status(
                employeeService.deleteEmployee(id) ?
                        HttpStatus.OK :
                        HttpStatus.NOT_FOUND

        ).build();
    }
}
