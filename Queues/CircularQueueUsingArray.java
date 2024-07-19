public class CircularQueueUsingArray{

    static class Queues{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queues(int n){  ///n == size
          arr = new int[n];
          size = n;
          rear = -1;
          front = -1;
        }

        // 1. isEmpty();
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        // 2. isFull();
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        //3. Add Operation; O(1)
        public static void add(int data){
                if(isFull()){
                    System.out.println("The Queue is full.");
                    return;
                }
                 if(front == -1){
                    front = 0;
                 }
                rear = (rear + 1) % size;
                arr[rear] = data;
        }

        //3. Remove Operation; O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("The Queue is Empty.");
                return -1;
            }
      
            int result = arr[front];
            
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front + 1) % size;
            }
            return result;
        }

        // 4. Peek Operation: O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("The Queue is empty.");
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queues q = new Queues(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("The removed Element is:" + q.remove());
        q.add(6);
        System.out.println("The removed Element is:" + q.remove());
        q.add(7);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}