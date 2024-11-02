package Exceptions;

public class Bank {
    private double amount;
    private double balance;

    public Bank(double amount, double balance) {
        this.amount = amount;
        this.balance = balance;
    }

    public void withdraw() throws Exception {
        if(amount > balance) {
            throw new Exception("Insufficient Funds");
        }
    }
}
