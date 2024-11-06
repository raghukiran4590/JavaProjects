package Generics;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
//        arr.add("Hello");
//        arr.add(3.14);
/*
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));*/

        //ClassCastException
        //Manual Type Casting
        //Incompatible Type Casting
        //Runtime Errors
        Integer o = arr.get(0);
        System.out.println(o);

    }
}
