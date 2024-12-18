package com.Employee.springboot_empDemo.repository;



import com.Employee.springboot_empDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
