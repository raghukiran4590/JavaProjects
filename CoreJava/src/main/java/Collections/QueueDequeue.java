package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDequeue {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        queue1.offer(2);
        queue1.offer(4);
        queue1.offer(6);
        queue1.add(3);
        queue1.poll();
        queue1.remove();
//        System.out.println(queue1);
//        System.out.println(queue1.peek());

        Deque<Integer> deque1 = new ArrayDeque<>();
        deque1.add(1);
        deque1.addFirst(2);
        deque1.addLast(9);
        deque1.add(3);
        deque1.addLast(4);
        deque1.addFirst(5);
        System.out.println(deque1);
        System.out.println(deque1.peek());
        deque1.poll();
        deque1.pollLast();
        deque1.pollFirst();
        System.out.println(deque1);
        System.out.println(deque1.peek());

    }
}
