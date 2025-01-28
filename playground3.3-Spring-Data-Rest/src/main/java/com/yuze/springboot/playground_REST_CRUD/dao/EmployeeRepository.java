package com.yuze.springboot.playground_REST_CRUD.dao;

import com.yuze.springboot.playground_REST_CRUD.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/*
 Spring data rest does not handle complex plural forms peron -> peeple
 this case need to specify the plural name, also use this specify different path name
 */
@RepositoryRestResource(path = "employees")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //this save all boiler-plate code of CRUD, findById, findAll, put, post , delete.
    //no need for more code
}
