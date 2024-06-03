package com.yuze.springboot.microTransactions.dao;

import com.yuze.springboot.microTransactions.entity.MicroTransaction;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public List<MicroTransaction> findByDate(String date) {

        //create query, the =:is the name parameter, which can be set later
        TypedQuery<MicroTransaction> query = entityManager.createQuery(
                "FROM MicroTransaction WHERE Date=:date", MicroTransaction.class
        );

        //set query parameters
        query.setParameter("date", date);

        //return results
        return query.getResultList();
    }

    @Override
    public List<MicroTransaction> findAll() {
        //create query, the =:is the name parameter, which can be set later
        TypedQuery<MicroTransaction> query = entityManager.createQuery(
                "FROM MicroTransaction", MicroTransaction.class
        );

        //return results
        return query.getResultList();
    }
}
