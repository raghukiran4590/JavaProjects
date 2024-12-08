package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> list2 = list1.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                System.out.println("Inside the Filter method for Integer : " + integer);
                return integer % 2 == 0;
            }
        }).map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                System.out.println("Inside the Filter method for Integer : " + integer);
                return integer * integer;
            }
        }).collect(Collectors.toList());

        System.out.println(list2);

        List<Integer> list3 = list1.stream().filter((i -> i % 2 == 0)).map(x -> x * x).collect(Collectors.toList());
        System.out.println(list3);
    }
}
