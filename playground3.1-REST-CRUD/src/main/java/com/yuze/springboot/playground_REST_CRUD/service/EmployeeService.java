package com.yuze.springboot.playground_REST_CRUD.service;

import com.yuze.springboot.playground_REST_CRUD.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
