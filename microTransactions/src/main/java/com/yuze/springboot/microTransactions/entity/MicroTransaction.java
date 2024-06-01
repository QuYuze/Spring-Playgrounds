package com.yuze.springboot.microTransactions.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "microTransactions")
public class MicroTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
}
