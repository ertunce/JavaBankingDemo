package com.bilgeadam.banking;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    protected Long id;
    protected Double balance;
    protected List<Transaction> transactionList;

    /**
     * Constructor for creating Account object
     * @param id
     * @param balance
     */
    public Account(Long id, Double balance) {
        this.id = id;
        this.balance = balance;
        this.transactionList = new ArrayList<Transaction>();
    }

    public abstract void makeTransaction(Transaction transaction) throws Exception;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
}
