package com.yuze.springboot.playground.employeeManager.service;

import com.yuze.springboot.playground.employeeManager.exceptions.UserNotFoundEceptions;
import com.yuze.springboot.playground.employeeManager.model.Employee;
import com.yuze.springboot.playground.employeeManager.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id){
        Optional<Employee> dbEmployee = employeeRepo.findById(id);
        Employee result = null;

        if(dbEmployee.isPresent()){
            result = dbEmployee.get();
        }else{
            throw new UserNotFoundEceptions("Employee Id does not exists: " + id);
        }
        return result;
    }

    public void deleteEmployeeById(Long id){
        employeeRepo.deleteById(id);
    }

    public List<Employee> addListOfEmployee(List<Employee> list){
        for (Employee currentEmployee : list) {
            currentEmployee.setEmployeeCode(UUID.randomUUID().toString());
        }
        List<Employee> dbList = employeeRepo.saveAll(list);
        return employeeRepo.saveAll(dbList);
    }

}
