import java.util.NoSuchElementException;

public class ImplementUsingNodeLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        private Node head = null;

        // Step 1: isEmpty()
        public boolean isEmpty() {
            return head == null;
        }

        // Step 2: push
        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // Step 3: pop()
        public int pop() {
            if (isEmpty()) {
               return -1;
            }
            int value = head.data;
            head = head.next;
            return value;
        }

        // Step 4: peek()
        public int peek() {
            if (isEmpty()) {
               return -1;
            }
            return head.data;
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
         System.out.println(s.peek());
        // Uncommenting the following line will throw an exception because the stack is empty
        // System.out.println(s.peek());
    }
}
