package com.bilgeadam.banking;

import com.bilgeadam.enums.TransactionType;

public class CheckingAccount extends Account{
    /**
     * Constructor for creating Account object
     *
     * @param id
     * @param balance
     */
    public CheckingAccount(Long id, Double balance) {
        super(id, balance);
    }

    /**
     *
     * @param transaction
     * @throws Exception if account balance is not sufficient for withdrawal
     */
    @Override
    public void makeTransaction(Transaction transaction) throws Exception {

        if(transaction.getType() == TransactionType.DEPOSIT){

            super.balance += transaction.getAmount();
            super.transactionList.add(transaction);

        }else if(transaction.getType() == TransactionType.WITHDRAWAL){

            if(super.balance < transaction.getAmount()){
                throw new Exception("Insufficient Funds");
            }

            super.balance -= transaction.getAmount();
            super.transactionList.add(transaction);
        }
    }
}
