package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wildcard {
    public static double sum(List<? extends Number> numbers) {
        double sum = 0;
        for (Number d: numbers) {
            sum += d.doubleValue();
        }
        return sum;
    }

    public static void printNumbers(List<? super Integer> numbersList) {
        for (Object o: numbersList) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
//        ArrayList<Double> numbers = new ArrayList<>();
        System.out.println(sum(Arrays.asList(2.2, 3.4, 5.6)));
        List<? super Number> list = Arrays.asList(1,2,3);
        list.add(0);
        list.add(4.9);
        list.add(null);
    }
}
