package Generics;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    private static <T> void shout(T thingToShout) {
        System.out.println(thingToShout + "!!!");
    }

    private static <T, V> void roar(T thingToShout, V animalRoar) {
        System.out.println(thingToShout + " " + animalRoar + "!!!");
    }

    private static void printList(List<?> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {

        Printer<Integer, Integer> p1 = new Printer<>(5, 1);
        p1.print();
        Printer<Double, Integer> p2 = new Printer<>(4.15, 2);
        p2.print();
        Printer<String, String> p3 = new Printer<>("Hello", "Blank");
        p3.print();

        shout("Hello");
        roar("Hello", "Lion");
        roar(5, "Elephants");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        printList(integerList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Tommy"));
        catList.add(new Cat("Kitty"));
        printList(catList);
        for (Cat cat: catList) {
            cat.whatsMyName();
        }

    }
}

    class Cat {
        private String name;

        Cat(String name) {
            this.name = name;
        }

         void whatsMyName() {
            System.out.println("My name is "+name);
        }
    }
