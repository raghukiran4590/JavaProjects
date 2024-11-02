package Exceptions;

public class Numbers {

    private int num1;
    private int num2;

    public Numbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void divideNums() {
        System.out.println("Result of Numbers Division is "+(num1/num2));
    }

    public static void main(String[] args) {
        try {
            Numbers mt = new Numbers(4, 0);
            mt.divideNums();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Program executed successfully!!!");
        }

    }
}
