package Exceptions;

public class InsufficientFunds extends Exception {
    private String message;
    public InsufficientFunds(String message) {
//        super("Are you alright! You don't have enough funds in your balance...");
        this.message = message;
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    @Override
    public String toString() {
//        return "Are you alright! You don't have enough funds in your balance...";
        return message;
    }
}
