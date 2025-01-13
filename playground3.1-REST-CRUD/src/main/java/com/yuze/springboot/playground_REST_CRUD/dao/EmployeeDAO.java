package com.yuze.springboot.playground_REST_CRUD.dao;

import com.yuze.springboot.playground_REST_CRUD.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findById(int thId);
    Employee save(Employee theEmployee);
    void deleteById(int id);
}
