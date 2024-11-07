package Generics;

public class Test<T> {
    private T value;
    <U> Test(U input) {
        System.out.println(input.getClass().getName());
    }

    public static void main(String[] args) {
       Box<String> b = new Box<>();
       b.setValue("Hello");
//       System.out.println(b.getValue());
       String str = b.getValue();
        System.out.println(str);

        KeyValue<String, Integer> kv = new KeyValue<>("Raghu", 30);
        System.out.println(kv.getKey());
        System.out.println(kv.getValue());

        Test<Integer> t = new Test(3.45);

    }
}
