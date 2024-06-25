public class PrintXtoPowerN {

    //INbuild Function:
    public static double power(int x,int n){
        return Math.pow(x,n);
    }

    //Power Recursive Function:
    public static double powerFuc(int x,int n){
        if(n==0){
            return 1;
        }
        return x*powerFuc(x,n-1);
    }

    //Optimised Function :
    public static double powerOpt(int x,int n){
        if(n==0){
            return 1;
        }

        double temp=powerOpt(x,n/2);
        if(n%2==0){
            return temp*temp;
        }
        else{
            return temp*temp*x;
        }
    }

    ///Leetcode:
    public double myPow(double x, int n) {
        if(x<0){
            return Math.pow(x,n);
        }
        else{
        return Math.abs(Math.pow(x,n));
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        // System.out.println(power(x, n));
        System.out.println(powerOpt(x, n));
    }
}
