package AccessModifiers1;

public class PrivateAccess {

    int num1 = 10;
    int num2 = 20;
    int sum;

    private void getSum() {
        System.out.println("Sum : "+(num1+num2));
    }

    public static void main(String[] args) {
        PrivateAccess ps = new PrivateAccess();
        ps.getSum();
    }

}
