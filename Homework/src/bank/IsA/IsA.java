package bank.IsA;

import bank.customer.Customer;
import bank.sbi.SBIBank;

public class IsA {
    public static void main(String[] args) {
        SBIBank myBank = new SBIBank(12345);  // Pass IFSC code here
        Customer customer = new Customer("Ram", 188);

        myBank.specificBankOperation();
        myBank.performBankOperations(customer);
    }
}
