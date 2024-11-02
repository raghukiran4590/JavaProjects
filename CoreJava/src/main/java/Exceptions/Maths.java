package Exceptions;

import java.sql.SQLOutput;

public class Maths {

    private int num1;
    private int num2;

    public Maths(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void divideNums() {
        System.out.println("Result of Numbers Division is "+(num1/num2));
    }

    public static void main(String[] args) {
        try {
//            System.out.println("Numbers Division");
            Maths mt = new Maths(4, 0);
            mt.divideNums();
        } catch (ArithmeticException e) {
//            System.out.println(e);
//            System.out.println(e.getMessage());
//            System.out.println(e.getLocalizedMessage());
//            System.out.println(e.getStackTrace());
            e.printStackTrace();
        }

    }
}
