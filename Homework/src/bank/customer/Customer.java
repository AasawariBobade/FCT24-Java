package bank.customer;

import bank.atm.ATM;

public class Customer {
    private String name;
    private final int accountNo;

    public Customer(String name, int accountNo) {
        this.name = name;
        this.accountNo = accountNo;
    }

    public void useATM(ATM atm, int amount) {
        System.out.println(name + " is using the ATM.");
        atm.withdrawMoney(amount);
    }
}


