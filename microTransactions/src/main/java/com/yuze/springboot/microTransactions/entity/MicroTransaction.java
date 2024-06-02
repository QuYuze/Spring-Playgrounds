package com.yuze.springboot.microTransactions.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "micro_transactions")
public class MicroTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "merchandise")
    private String Merchandise;

    @Column(name = "date")
    private String Date;

    @Column(name = "amount")
    private double Amount;

    public MicroTransaction(){

    }

    public MicroTransaction(String merchandise, String date, double amount) {
        Merchandise = merchandise;
        Date = date;
        Amount = amount;
    }

    @Override
    public String toString() {
        return "MicroTransaction{" +
                "id=" + id +
                ", Merchandise='" + Merchandise + '\'' +
                ", Date='" + Date + '\'' +
                ", Amount=" + Amount +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMerchandise() {
        return Merchandise;
    }

    public void setMerchandise(String merchandise) {
        Merchandise = merchandise;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }
}
