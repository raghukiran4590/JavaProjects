package Exceptions;

public class Test {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank(500, 100);
        bank.withdraw();
    }
}
