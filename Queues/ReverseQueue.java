import java.util.*;
public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverseQueue(q);
    }
}
