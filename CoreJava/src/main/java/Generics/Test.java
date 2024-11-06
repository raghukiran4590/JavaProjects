package Generics;

public class Test {
    public static void main(String[] args) {
       Box<String> b = new Box<>();
       b.setValue("Hello");
//       System.out.println(b.getValue());
       String str = b.getValue();
        System.out.println(str);
    }
}
