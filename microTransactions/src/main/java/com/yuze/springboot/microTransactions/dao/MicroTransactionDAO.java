package com.yuze.springboot.microTransactions.dao;

import com.yuze.springboot.microTransactions.entity.MicroTransaction;
import jakarta.persistence.EntityManager;

import java.util.List;

public interface MicroTransactionDAO {

    void save(MicroTransaction microTransaction);

    List<MicroTransaction> findByDate(String date);

    List<MicroTransaction> findAll();
}
