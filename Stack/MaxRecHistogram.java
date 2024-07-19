import java.util.Stack;

public class MaxRecHistogram {
    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        
        //Next smaller right:
        Stack<Integer> s = new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,4};
    }
}
