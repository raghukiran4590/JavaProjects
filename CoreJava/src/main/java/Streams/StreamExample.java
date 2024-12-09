package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Sequential Stream Example
/*        list.stream().filter(number -> {
            System.out.println("In Filter method, number :  "+number+" thread : "+Thread.currentThread().getName());
            return number % 2 == 0;
        })
                .map(number -> {
                    System.out.println("In Map method, number :  "+number+" thread : "+Thread.currentThread().getName());
                    return number * number;
                }).forEachOrdered(number -> {
                    System.out.println("In ForEach method, number :  "+number+" thread : "+Thread.currentThread().getName());
                });*/

        //Parallel Stream Example
        list.parallelStream().filter(number -> {
                    System.out.println("In Filter method, number :  "+number+" thread : "+Thread.currentThread().getName());
                    return number % 2 == 0;
                })
                .map(number -> {
                    System.out.println("In Map method, number :  " + number + " thread : " + Thread.currentThread().getName());
                    return number * number;
                }).forEachOrdered(number -> {
                    System.out.println("In ForEach method, number :  " + number + " thread : " + Thread.currentThread().getName());
                });

        System.out.println(Runtime.getRuntime().availableProcessors());

        List<String> StrList = Arrays.asList("J", "A", "V", "A", "P", "R", "O", "G", "R", "A", "M");
        StrList.stream().forEach(System.out::print);
        System.out.println();
        StrList.parallelStream().forEach(System.out::print);

    }
}
