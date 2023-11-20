package com.bilgeadam.banking;

import com.bilgeadam.enums.TransactionType;

public class SavingAccount extends Account{

    /**
     * Constructor for creating Account object
     *
     * @param id
     * @param balance
     */
    public SavingAccount(Long id, Double balance) {
        super(id, balance);
    }

    /**
     *
     * @param transaction
     * @throws Exception if user tries to withdraw money from the saving account.
     */
    @Override
    public void makeTransaction(Transaction transaction) throws Exception {

        if(transaction.getType() == TransactionType.DEPOSIT){

            super.balance += transaction.getAmount();
            super.transactionList.add(transaction);

        }else if(transaction.getType() == TransactionType.WITHDRAWAL){
            throw new Exception("You can not withdraw money from your saving account!");
        }
    }
}
