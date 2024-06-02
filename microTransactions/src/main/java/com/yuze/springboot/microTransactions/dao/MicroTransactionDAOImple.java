package com.yuze.springboot.microTransactions.dao;

import com.yuze.springboot.microTransactions.entity.MicroTransaction;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class MicroTransactionDAOImple implements MicroTransactionDAO{

    private EntityManager entityManager;

    @Autowired
    public MicroTransactionDAOImple(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(MicroTransaction microTransaction) {
        entityManager.persist(microTransaction);
    }
}
