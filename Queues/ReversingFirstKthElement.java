// Que: Reversing the first K elements of a Queue
// We have an integer k and a queue of integers,we need to reverse the order of the first k elements  of the queue, leaving the other elements in the same relative order

// Sample Input 1:Q = [10, 20, 30, 40, 50, 60, 70,80, 90, 100] ,k=5
// Sample Output 1: Q = [50, 40, 30, 20, 10, 60, 70,80, 90, 100

import java.util.*;
public class ReversingFirstKthElement {
    public static void reverseKth(Deque<Integer> dq,int k){
        Queue<Integer> q= new LinkedList<>();
        
        int size = dq.size();

        for(int i=0;i<size/2;i++){
            q.add(dq.removeFirst());
        }

        while(!q.isEmpty()){
            dq.addFirst(q.remove());
        }
    }
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        int k = 5;

        reverseKth(q,k);
        System.out.println(q);
    }
}
