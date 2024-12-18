package com.Employee.springboot_empDemo.controller;

import com.Employee.springboot_empDemo.entity.Employee;
import com.Employee.springboot_empDemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees") // Base URL for the controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;


    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(repository.save(employee));
    }


    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(repository.findAll());
    }


    @PostMapping("/bulk")
    public ResponseEntity<List<Employee>> saveEmployees(@RequestBody List<Employee> employees) {
        return ResponseEntity.ok(repository.saveAll(employees));
    }
}
