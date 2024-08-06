package com.yuze.springboot.playground_REST_CRUD.restController;

import com.yuze.springboot.playground_REST_CRUD.dao.EmployeeDAO;
import com.yuze.springboot.playground_REST_CRUD.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeController(@Qualifier("employeeDAOImpl") EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        System.out.println("Return all exisiting Employee...");
        return employeeDAO.findAll();
    }
}
