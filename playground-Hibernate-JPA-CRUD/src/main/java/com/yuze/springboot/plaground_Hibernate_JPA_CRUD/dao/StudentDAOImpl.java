package com.yuze.springboot.plaground_Hibernate_JPA_CRUD.dao;

import com.yuze.springboot.plaground_Hibernate_JPA_CRUD.entity.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public List<Student> findAll() {
        //create query, need to use entity name and entity filed, not database table or field
        TypedQuery<Student> query = entityManager.createQuery("FROM Student order by lastName desc", Student.class);

        //return query results
        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        //create query, the =:is the name parameter, which can be set later
        TypedQuery<Student> query = entityManager.createQuery(
                "FROM Student WHERE lastName=:theData", Student.class);

        //set query parameters
        query.setParameter("theData", lastName);

        //return results
        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student student = entityManager.find(Student.class, id);
        entityManager.remove(student);

    }

    @Override
    @Transactional
    public int deleteAll() {
        int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return numRowsDeleted;
    }
}
