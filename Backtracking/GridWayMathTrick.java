///Permutation formula for finding the ways are:
///nPr = ((n-1)+(m-1))!
//      -----------------
//        (n-1)! (m-1)!



public class GridWayMathTrick {
    public static int ways(int n,int m){
        int nume = (n-1)+(m-1);
        int numeFact = factorial(nume);

        int nMin1 = n-1;
        int nFact = factorial(nMin1);
        int mMin1 = m-1;
        int mFact = factorial(mMin1);

        int ways = numeFact/(nFact*mFact);

        return ways;
    }

    public static int factorial(int x){
        if(x == 0 || x == 1){
            return 1;
        }
        return x*factorial(x-1);
    }

    public static void main(String[] args) {
        int n = 10, m = 7;
        System.out.println(ways(n, m));
    }
}


//import java.math.BigInteger;
/*public class GridWayMathTrick {
    public static BigInteger ways(int n, int m){
        int nume = (n - 1) + (m - 1);
        BigInteger numeFact = factorial(nume);

        int nMin1 = n - 1;
        BigInteger nFact = factorial(nMin1);
        int mMin1 = m - 1;
        BigInteger mFact = factorial(mMin1);

        BigInteger ways = numeFact.divide(nFact.multiply(mFact));

        return ways;
    }

    public static BigInteger factorial(int x){
        if (x == 0 || x == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(x).multiply(factorial(x - 1));
    }

    public static void main(String[] args) {
        int n = 10, m = 10;
        System.out.println(ways(n, m)); // Output should be 48620
    }
}*/

