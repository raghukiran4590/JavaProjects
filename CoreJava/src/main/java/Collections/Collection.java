package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Collection {

    public static void main(String[] args) {
        ArrayList<String> arraylist1 = new ArrayList<>();
        arraylist1.add("Ford");
        arraylist1.add("Toyota");
        arraylist1.add("Honda");
        arraylist1.add("Hyndai");
        arraylist1.add("Kia");
        System.out.println(arraylist1);
        System.out.println(arraylist1.size());
        System.out.println("****************************");

        int[] arr1 = {10,45,56,78,99,71};
        System.out.println(arr1.length);
        Arrays.sort(arr1);
        for(int i : arr1) {
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.asList(arr1);

        Integer[] numbers = {1, 2, 3, 4, 5};

        Iterator<Integer> iterator = Arrays.stream(numbers).iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Iterator<String> iterator2 = arraylist1.iterator();

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        int[] numbers2 = {1, 2, 3, 4, 5};

        Arrays.stream(numbers2)
                .forEach(System.out::println);

        Arrays.stream(arr1).sorted().
                forEach(System.out::println);
    }

    }
