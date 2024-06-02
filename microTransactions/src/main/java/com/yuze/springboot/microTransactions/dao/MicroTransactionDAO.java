package com.yuze.springboot.microTransactions.dao;

import com.yuze.springboot.microTransactions.entity.MicroTransaction;
import jakarta.persistence.EntityManager;

public interface MicroTransactionDAO {

    void save(MicroTransaction microTransaction);
}
