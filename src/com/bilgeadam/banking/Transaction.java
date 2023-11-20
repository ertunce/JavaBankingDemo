package com.bilgeadam.banking;


import com.bilgeadam.enums.TransactionType;

import java.util.Date;

public class Transaction {

    private Long id;
    private Long receiverAccountId;
    private TransactionType type;
    private Double amount;
    private Date transactionDate;

    /**
     * Constructor for creating transaction object
     *
     * @param id
     * @param receiverAccountId
     * @param type
     * @param amount
     */
    public Transaction(Long id, Long receiverAccountId, TransactionType type, Double amount) {
        this.id = id;
        this.receiverAccountId = receiverAccountId;
        this.type = type;
        this.amount = amount;
        this.transactionDate = new Date();
    }

    /**
     *
     * @return id of transaction as Long
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReceiverAccountId() {
        return receiverAccountId;
    }

    public void setReceiverAccountId(Long receiverAccountId) {
        this.receiverAccountId = receiverAccountId;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }
}
