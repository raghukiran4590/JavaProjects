package Generics;

public class Main {
    public static void main(String[] args) {
 /*       double result1 = Operation.ADD.apply(10, 20);
        double result2 = Operation.MULTIPLY.apply(5.5, 4);
        System.out.println(result1);  // Output: 30.0
        System.out.println(result2);  // Output: 22.0*/

        int add = ArithmeticOperation.ADD.calculate(10, 5);
        int subtract = ArithmeticOperation.SUBTRACT.calculate(10, 5);
        System.out.println(add);  // Output: 15
        System.out.println(subtract);  // Output: 5
    }
}
