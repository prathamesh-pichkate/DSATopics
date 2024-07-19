// Deque - double ended queue.
// All the operation of deque are provide below.

import java.util.Deque;
import java.util.LinkedList;
public class DequeOperations {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        //1. addFirst();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        System.out.println(dq);

        // 2. addLast()
        dq.addLast(4);
        dq.addLast(5);
        dq.addLast(6);
        System.out.println(dq);

        //3.getFirst();
        System.out.println(dq.getFirst());

        //4.getLast();
        System.out.println(dq.getLast());

        //5.removeLast();
        System.out.println(dq.removeLast());

        //6.removeFirst();
        System.out.println(dq.removeFirst());

     



        while(!dq.isEmpty()){
            System.out.println(dq.getFirst());
            dq.removeFirst();
        }
    }
}
