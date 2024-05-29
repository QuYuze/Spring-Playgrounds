package com.yuze.springboot.plaground_Hibernate_JPA_CRUD.dao;

import com.yuze.springboot.plaground_Hibernate_JPA_CRUD.entity.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//Handle componenet sacnning and datbase expcetion supprt
@Repository
public class StudentDAOImpl implements StudentDAO{

    // define field for entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    //implement the save
    //add transaction since this is save operation
    @Transactional
    @Override
    public void save(Student theStudent) {
        //save the student
        entityManager.persist(theStudent);
    }

    //no need for transactional since this is just update
    @Override
    public Student findByID(Integer id) {
        return entityManager.find(Student.class, id);
    }
}
