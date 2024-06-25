public class PrintNumber{

    ///Decreasing Order:
    public static void decreasing(int n){
       for(int i=n;i>=0;i--){
           System.out.println(i);
       } 
    }

    public static int useRecursionToPrintDecreasing(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return useRecursionToPrintDecreasing(n-1);
    }

    //Increasing:
    public static void useRecursionToPrintIncreasing(int n, int current) {
        if (current > n) {
            return;
        }
    
        System.out.println(current);
        useRecursionToPrintIncreasing(n, current + 1);
    }

    public static void main(String args[]){
    // decreasing(10);
    // useRecursion(10);
    useRecursionToPrintIncreasing(10, 0);
    }
}