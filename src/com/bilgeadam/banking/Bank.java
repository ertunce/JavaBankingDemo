package com.bilgeadam.banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Customer> customerList;

    public Bank(String name) {
        this.name = name;
        this.customerList = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCustomer(Customer customer){
        customerList.add(customer);
    }

    public void removeCustomer(Customer customer) throws Exception {

        if(!customerList.remove(customer)){
            throw new Exception("Customer cannot be deleted from the " + name);
        }else {
            System.out.println("Customer deleted successfully from the " + name);
        }
    }
}
