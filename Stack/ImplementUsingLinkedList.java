import java.util.LinkedList;

public class ImplementUsingLinkedList {
    static class Stack {
        static LinkedList<Integer> ll = new LinkedList<>();

        // Step 1: Push O(1)
        public static void push(int data) {
            ll.addFirst(data);
        }

        // Step 2: Pop O(1)
        public static int pop() {
            if(isEmpty()){
               return 0;    
            }

            int value = ll.getFirst();
            ll.removeFirst();
            return value;
        }

        // Step 3: Peek O(1)
        public static int peek() {
            if(isEmpty()){
                return 0;
            }
            return ll.getFirst();
        }

        // Step 4: isEmpty O(1)
        public static boolean isEmpty() {
            return ll.size() == 0;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
