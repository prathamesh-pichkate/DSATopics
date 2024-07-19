
import java.util.*;
public class QueueUsingDeque {
    static class Queue{
       static Deque<Integer> dq = new LinkedList<>();

        // 1. Add
        public static void add(int data){
            dq.addLast(data);
        }

        // 2.peek()
        public static int peek(){
            return dq.getFirst();
        }

        //3.remove()
        public static int remove(){
            return dq.removeFirst();
        }

        //4.isEmpty();
        public static boolean isEmpty(){
            return dq.isEmpty();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
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
