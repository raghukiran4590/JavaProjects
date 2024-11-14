package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class BankAccount {

    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName() + " attempting to withdraw amount "+amount);

        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if(balance >= amount) {
                    try {
                    System.out.println(Thread.currentThread().getName() + " proceeding with the withdrawal");
                    Thread.sleep(3000);
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() +" has completed the withdrawal. Remaining balance is : "+balance);
                 } catch (Exception e) {
                    System.out.println(e);
                } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() +" has insufficient balance");
                }
             } else {
                System.out.println(Thread.currentThread().getName() + " couldn't acquire the lock, will try again later.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
