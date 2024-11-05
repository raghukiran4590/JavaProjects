package Recursion;

public class SumOfNaturalNumbers {

    public static int naturalNumberSum(int num) {
        if(num<=1)
            return 1;
        return num + naturalNumberSum(num-1);
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Sum of all the Natural numbers till "+num+" is : "+naturalNumberSum(num));
    }
}
