package Lambda;

public class FirstInterfaceClass {

    public static void main(String[] args) {

        FirstInterface lambdaExpression = Double::sum;
        System.out.println(lambdaExpression.getSum(11.24, 43.45));
    }
}
