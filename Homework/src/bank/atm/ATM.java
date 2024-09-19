package bank.atm;

public class ATM {
    private int amount;

    public ATM(int amount) { 
        this.amount = amount;
    }

    public void withdrawMoney(int amount) {  
        System.out.println("ATM withdraw amount " + amount);
    }
}