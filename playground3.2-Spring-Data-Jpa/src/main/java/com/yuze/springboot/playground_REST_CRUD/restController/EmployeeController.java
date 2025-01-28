package com.yuze.springboot.playground_REST_CRUD.restController;

import com.yuze.springboot.playground_REST_CRUD.entity.Employee;
import com.yuze.springboot.playground_REST_CRUD.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(@Qualifier("employeeServiceImpl") EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        System.out.println("Return all exisiting Employee...");
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable int employeeId){

        Employee employee = employeeService.findById(employeeId);
        if(employee == null){
            throw new RuntimeException("Employee id does not exists");
        }

        return employee;
    }

    //add mapping for POST /employee - add new employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        // in case there's a id, set id to 0
        // this is force save of new item instead of the updateq
        employee.setId(0);
        Employee dbEmployee = employeeService.save(employee);

        return dbEmployee;
    }

    @PutMapping("/employees")
    public Employee updateById(@RequestBody Employee employee){
        Employee dbEmployee = employeeService.save(employee);

        return dbEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteById(@PathVariable int employeeId){
        Employee tempEmployee = employeeService.findById(employeeId);
        if(tempEmployee == null){
            throw new RuntimeException("Employeee id not found: "+ employeeId);
        }
        employeeService.deleteById(employeeId);

        return "Deleted Employee with id : "+ employeeId;
    }
}
