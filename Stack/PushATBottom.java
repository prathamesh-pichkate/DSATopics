import java.util.Stack;

public class PushATBottom {
    public static void bottomPush(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        bottomPush(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
       Stack<Integer> s = new Stack<>();
       s.push(1);
       s.push(2);
       s.push(3);
       s.push(4);
       s.push(5);

       bottomPush(s,44);
       while(!s.isEmpty()){
           System.out.println(s.peek());
           s.pop();
       }
    }
}
