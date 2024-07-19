public class QueuesUsingArray{

    static class Queues{
        static int arr[];
        static int size;
        static int rear;
        Queues(int n){  ///n == size
          arr = new int[n];
          size = n;
          rear = -1;
        }

        // 1. isEmpty();
        public static boolean isEmpty(){
            return rear == -1;
        }

        //2. Add Operation;
        public static void add(int data){
                if(rear == size-1){
                    System.out.println("The Queue is full.");
                    return;
                }

                rear = rear + 1;
                arr[rear] = data;
        }

        //3. Remove Operation;
        public static int remove(){
            if(isEmpty()){
                System.out.println("The Queue is Empty.");
                return -1;
            }
      
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        // 4. Peek Operation:
        public static int peek(){
            if(isEmpty()){
                System.out.println("The Queue is empty.");
                return -1;
            }

            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queues q = new Queues(5);

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