package Recursion;

public class Factorial {

    public static int fact(int num) {
        if(num<=1)
            return 1;
        return num * fact(num-1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of the number "+num+" is : "+fact(num));
    }
}
