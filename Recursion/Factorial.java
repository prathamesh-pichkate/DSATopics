public class Factorial {
    public static int FactorialNumber(int n){
        if(n==0 || n==1){
            return 1;
        }

        return n*FactorialNumber(n-1);
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(FactorialNumber(n));
    }
}
