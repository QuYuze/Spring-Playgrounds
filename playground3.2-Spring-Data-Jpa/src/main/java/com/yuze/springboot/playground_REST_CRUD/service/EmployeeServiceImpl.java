package com.yuze.springboot.playground_REST_CRUD.service;

import com.yuze.springboot.playground_REST_CRUD.dao.EmployeeRepository;
import com.yuze.springboot.playground_REST_CRUD.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(@Qualifier("employeeRepository") EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        //different patterns insted of having to check for null
        Optional<Employee> result = employeeRepository.findById(id);
        Employee employee = null;

        if(result.isPresent()){
            employee = result.get();
        }else{
            //didn't find employee
            throw new RuntimeException("Didn't find employee with id : " + id);
        }
        return employee;
    }

    //no longer need since JPA handles @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    //@Transactional
    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}
