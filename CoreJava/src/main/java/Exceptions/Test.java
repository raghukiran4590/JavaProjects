package Exceptions;

public class Test {
    public static void main(String[] args) throws InsufficientFunds {
        Bank bank = new Bank(500, 100);
        bank.withdraw();
    }
}
