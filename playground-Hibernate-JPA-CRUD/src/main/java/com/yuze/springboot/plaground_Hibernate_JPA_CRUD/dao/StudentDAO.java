package com.yuze.springboot.plaground_Hibernate_JPA_CRUD.dao;

import com.yuze.springboot.plaground_Hibernate_JPA_CRUD.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findByID(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void update(Student student);

    void delete(Integer id);

    int deleteAll();
}
