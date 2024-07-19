import java.util.*;
public class ImplementUsingArrayList{
     static class ExplicitStack{
        static ArrayList<Integer> list = new ArrayList<Integer>();
        
        // Step 1: Push O(1)
        public static void push(int data){
          list.add(data);   ///add operation of ArrayList
        }

        //Step 2: pop O(1)
        public static int pop(){
          int value = list.get(list.size()-1);
          list.remove(list.size()-1);
          return value;
        }

        //Step 3: peek O(1)
        public static int peek(){
          return list.get(list.size()-1);
        }

        //Step 4: isEmpty()
        public static boolean isEmpty(){
          return list.size()==0;
        }
     }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
    }
}