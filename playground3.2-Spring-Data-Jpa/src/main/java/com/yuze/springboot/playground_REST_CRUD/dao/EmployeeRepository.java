package com.yuze.springboot.playground_REST_CRUD.dao;

import com.yuze.springboot.playground_REST_CRUD.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //this save all boiler-plate code of CRUD, findById, findAll, put, post , delete.
    //no need for more code
}
