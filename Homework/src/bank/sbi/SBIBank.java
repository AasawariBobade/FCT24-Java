package bank.sbi;

import bank.Bank;

public class SBIBank extends Bank {
    public static int IFSCcode;

    public SBIBank(int IFSCcode) {
        super();  // Call to Bank's constructor
        SBIBank.IFSCcode = IFSCcode;  // Assigning value to static final variable
    }

    public void specificBankOperation() {
        System.out.println("Performing specific SBI Bank operation.");
    }
}
