/// Queue using the java collection framework

import java.util.*;
public class QueueUsingJCF {
    public static void main(String[] args) {
        // As Queue is the Interface so we can't create the object of it , so we can use the array and linked list.
        Queue<Integer> q = new LinkedList<>(); 
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
