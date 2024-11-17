package Generics;

//public class Printer<t extends Integer> {

public class Printer<T,V> {

    T t;
    V v;

    public Printer(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public void print() {
        System.out.println("Printing "+t+" books and "+v+" pages");
    }
}
