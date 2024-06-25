import java.util.*;
public class SumOfNumbers {
    public static int sumNumber(int n){
        if(n==0){
            return 0;
        }
        int sum=0;
        sum = n +sumNumber(n-1);
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the number :");
        int n=sc.nextInt();
        System.out.println(sumNumber(n));
    }
}
