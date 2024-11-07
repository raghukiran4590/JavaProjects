package Generics;

public class Pair {
     <K,V> Pair(K key, V value) {
        System.out.println("Key : "+key+" Value : "+value);
    }

    public static void main(String[] args) {
        Pair p1 = new Pair(1, "NYC");
        Pair p2 = new Pair(2, "SFO");
    }
}
