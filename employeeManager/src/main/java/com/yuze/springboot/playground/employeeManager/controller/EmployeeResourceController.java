package com.yuze.springboot.playground.employeeManager.controller;

import com.yuze.springboot.playground.employeeManager.model.Employee;
import com.yuze.springboot.playground.employeeManager.service.EmployeeService;
import com.yuze.springboot.playground.employeeManager.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeResourceController {

    private final EmployeeServiceImpl employeeService;

    @Autowired
    public EmployeeResourceController(EmployeeServiceImpl employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee dbEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(dbEmployee, HttpStatus.CREATED);
    }

    @PostMapping("/addList")
    public ResponseEntity<List<Employee>> addListOfEmployee(@RequestBody List<Employee> list){
        List<Employee> dbList = employeeService.addListOfEmployee(list);
        return new ResponseEntity<>(dbList, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee dbEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(dbEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployeeById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
