// Stack implemented using the Stack class and deque DS.

import java.util.*;
public class StackUsingDeque {
    static class Stack{
        static Deque<Integer> dq = new LinkedList<>();

        // 1.push()
        public static void push(int data){
          dq.addLast(data);
        }

        //2.peek()
        public static int peek(){
           return dq.getLast();
        }

        //3.pop()
        public static void pop(){
            dq.removeLast();
        }

        //4.isEmpty
        public static boolean isEmpty(){
            return dq.isEmpty();
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
           System.out.println(s.peek());
           s.pop();
        }
    }
}
