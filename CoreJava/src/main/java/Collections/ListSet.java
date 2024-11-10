package Collections;

import java.util.*;

public class ListSet {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(1);
//        System.out.println(list1);

        LinkedList<Integer> llist1 = new LinkedList<>();
        llist1.add(34);
        llist1.add(12);
        llist1.add(4);
        llist1.add(50);
//        System.out.println(llist1);


        Vector<Integer> vector1 = new Vector<>();
        vector1.add(1);
        vector1.add(99);
        vector1.add(34);
        vector1.add(21);
        vector1.add(2);
        vector1.add(1);
//        System.out.println(vector1);

        Stack<Integer> stack1 = new Stack<>();
        stack1.push(3);
        stack1.push(21);
        stack1.push(33);
        stack1.push(1);
        stack1.push(2);
        stack1.push(76);
//        System.out.println(stack1);
        stack1.pop();
        stack1.pop();
//        stack1.peek();
        System.out.println(stack1);
        System.out.println(stack1.peek());

        HashSet<Integer> hset1 = new HashSet<>();
        hset1.add(1);
        hset1.add(9);
        hset1.add(8);
        hset1.add(3);
        hset1.add(2);
        hset1.add(9);
        hset1.add(1);
//        System.out.println(hset1);

        LinkedHashSet<Integer> lhset1 = new LinkedHashSet<>();
        lhset1.add(1);
        lhset1.add(9);
        lhset1.add(8);
        lhset1.add(3);
        lhset1.add(2);
        lhset1.add(9);
        lhset1.add(1);
//        System.out.println(lhset1);

        TreeSet<Integer> tset1 = new TreeSet<>();
        tset1.add(1);
        tset1.add(9);
        tset1.add(8);
        tset1.add(3);
        tset1.add(2);
        tset1.add(9);
        tset1.add(1);
//        System.out.println(tset1);
    }
}
