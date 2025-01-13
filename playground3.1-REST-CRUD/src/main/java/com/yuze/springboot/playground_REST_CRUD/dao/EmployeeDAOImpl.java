package com.yuze.springboot.playground_REST_CRUD.dao;

import com.yuze.springboot.playground_REST_CRUD.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Type;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    //define fields for entity manager
    private EntityManager entityManager;

    //set up constructor injection
    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        //create query
        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);

        //execute query and get result list
        List<Employee> result = query.getResultList();

        //return list
        return result;
    }

    @Override
    public Employee findById(int id) {

        //get employee by id
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public Employee save(Employee theEmployee) {

        //save or update the entity, if id!=0, update;
        Employee employee = entityManager.merge(theEmployee);
        return employee;
    }

    @Override
    public void deleteById(int id) {
        //find by employeee by id
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);

    }
}
