package bank;

import bank.atm.ATM;
import bank.customer.Customer;

public class Bank {
    private ATM atm;

    public Bank() {
        atm = new ATM(1000);  // Has-A relationship
    }

    public ATM getATM() {
        return atm;
    }

    public void performBankOperations(Customer customer) {
        System.out.println("Performing bank operations for customer.");
        customer.useATM(atm, 100);  // Uses-A relationship
    }
}
