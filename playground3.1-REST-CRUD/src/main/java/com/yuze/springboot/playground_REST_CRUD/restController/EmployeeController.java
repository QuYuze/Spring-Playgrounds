package com.yuze.springboot.playground_REST_CRUD.restController;

import com.yuze.springboot.playground_REST_CRUD.dao.EmployeeDAO;
import com.yuze.springboot.playground_REST_CRUD.entity.Employee;
import com.yuze.springboot.playground_REST_CRUD.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(@Qualifier("employeeServiceImpl") EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        System.out.println("Return all exisiting Employee...");
        return employeeService.findAll();
    }
}
