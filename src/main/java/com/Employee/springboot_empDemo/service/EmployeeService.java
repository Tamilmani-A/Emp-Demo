package com.Employee.springboot_empDemo.service;

import com.Employee.springboot_empDemo.entity.Employee;
import com.Employee.springboot_empDemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;


    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }


    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }


    public List<Employee> saveEmployees(List<Employee> employees) {
        return repository.saveAll(employees);
    }
}
