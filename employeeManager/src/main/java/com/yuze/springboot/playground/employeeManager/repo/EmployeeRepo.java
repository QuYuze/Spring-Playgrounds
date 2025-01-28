package com.yuze.springboot.playground.employeeManager.repo;

import com.yuze.springboot.playground.employeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository <Employee, Long> {
}
