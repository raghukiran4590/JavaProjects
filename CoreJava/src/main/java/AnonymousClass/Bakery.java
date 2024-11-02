package AnonymousClass;

public class Bakery implements Payment{

    @Override
    public void payAmount(double amount) {
        System.out.println("Amount Paid : "+amount);
    }
}
