package com.bilgeadam;

import com.bilgeadam.banking.*;
import com.bilgeadam.enums.TransactionType;

public class Main {

    public static void main(String[] args) {

        Bank myBank = new Bank("Test Bank");

        Customer customer1 = new Customer("Ahmet");
        Customer customer2 = new Customer("Ayşe");
        Customer customer3 = new Customer("Mehmet");

        Account customer1SavingAccount = new SavingAccount(1L, 0.0);
        Account customer1CheckingAccount = new CheckingAccount(2L, 0.0);

        Account customer2SavingAccount = new SavingAccount(3L, 0.0);
        Account customer2CheckingAccount = new CheckingAccount(4L, 0.0);

        Account customer3SavingAccount = new SavingAccount(5L, 0.0);
        Account customer3CheckingAccount = new CheckingAccount(6L, 0.0);

        try {
            customer1.addAccount(customer1SavingAccount);
            customer1.addAccount(customer1CheckingAccount);

            customer2.addAccount(customer2SavingAccount);
            customer2.addAccount(customer2CheckingAccount);

            customer3.addAccount(customer3SavingAccount);
            customer3.addAccount(customer3CheckingAccount);

            myBank.addCustomer(customer1);
            myBank.addCustomer(customer2);
            myBank.addCustomer(customer3);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(customer1.getName() + "'s Accounts' Balance");
        for( int i = 0; i < customer1.getAccountList().size() ; i++){
            System.out.println("Account Id: " + customer1.getAccountList().get(i).getId() + " Balance: "
                    + customer1.getAccountList().get(i).getBalance());
        }

        //DEPOSIT 50₺ to checking account
        for( int i = 0; i < customer1.getAccountList().size() ; i++){
            if(customer1.getAccountList().get(i).getClass() == CheckingAccount.class){

                Transaction transaction = new Transaction(1L,2L, TransactionType.DEPOSIT,50.0);

                try {
                    customer1.getAccountList().get(i).makeTransaction(transaction);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(customer1.getName() + "'s Accounts' Balance");
        for( int i = 0; i < customer1.getAccountList().size() ; i++){
            System.out.println("Account Id: " + customer1.getAccountList().get(i).getId() + " Balance: "
                    + customer1.getAccountList().get(i).getBalance());
        }

        //WITHDRAW 45₺ to checking account
        for( int i = 0; i < customer1.getAccountList().size() ; i++){
            if(customer1.getAccountList().get(i).getClass() == CheckingAccount.class){

                Transaction transaction = new Transaction(1L,2L, TransactionType.WITHDRAWAL,45.0);

                try {
                    customer1.getAccountList().get(i).makeTransaction(transaction);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(customer1.getName() + "'s Accounts' Balance");
        for( int i = 0; i < customer1.getAccountList().size() ; i++){
            System.out.println("Account Id: " + customer1.getAccountList().get(i).getId() + " Balance: "
                    + customer1.getAccountList().get(i).getBalance());
        }

        //WITHDRAW 55₺ to checking account
        for( int i = 0; i < customer1.getAccountList().size() ; i++){
            if(customer1.getAccountList().get(i).getClass() == CheckingAccount.class){

                Transaction transaction = new Transaction(1L,2L, TransactionType.WITHDRAWAL,55.0);

                try {
                    customer1.getAccountList().get(i).makeTransaction(transaction);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
