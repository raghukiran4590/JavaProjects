package Generics;

public class Test {
    public static void main(String[] args) {
       Box b = new Box();
       b.setValue("Hello");
//       System.out.println(b.getValue());
       Integer i = (Integer) b.getValue();
    }
}
