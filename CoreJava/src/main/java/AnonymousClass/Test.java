package AnonymousClass;

public class Test {
    public static void main(String[] args) {
//        Bakery bk = new Bakery();
//        bk.payAmount(150.65);
//        anonymous inner method
        Payment pmt = new Payment() {
            @Override
            public void payAmount(double amount) {
                System.out.println("Total Amount Paid : "+amount);
            }
        };
        pmt.payAmount(145.89);
    }
}
