public class QueusUsingLL{
     static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
     }

    static class Queues{
       static Node head = null;
       static Node tail = null;

        // 1. isEmpty();
        public static boolean isEmpty(){
           return head == null & tail == null; 
        }

        //2. Add Operation; O(1)
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }

        //3. Remove Operation; O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("The Queus is Empty.");
                return -1;
            }
            
            Node temp = head;
            if(tail == head){
                head = tail =null;
            }else{
                head = head.next;
            }
            return temp.data;
        }

        // 4. Peek Operation: O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("The Queue is empty.");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        Queues q = new Queues();

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