package com.bilgeadam.banking;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Account> accountList;

    public Customer(String name) {
        this.name = name;
        this.accountList = new ArrayList<Account>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    /**
     * Deletes account of customer
     *
     * @param account
     * @return
     * @throws Exception
     */
    public boolean removeAccount(Account account) throws Exception {

        if(account.getBalance() != 0){
            throw new Exception("You cannot delete your account if you has money in it.");
        }
        return accountList.remove(account);
    }

    /**
     * Creates a new account for customer
     *
     * @param account
     * @throws Exception
     */
    public void addAccount(Account account) throws Exception {
        boolean result = accountList.add(account);

        if(result){
            System.out.println("Account has been added!");
        }else{
            System.out.println("Account cannot be added");
            throw new Exception("Account cannot be added");
        }
    }




}
