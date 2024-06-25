import java.util.*;
public class PairsInArray {

    // Time Complexity : O(n^2)
    public static void printPairs(int arr[]) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+i+","+j+")");
            }
            System.out.println();
        }
    }

    //Print Subarrays:
    public static void printSubarrays(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


    //Print Subarray with MaxSubarraySum: BRUTE FORCE APPROACH
    //Time complexity :O(n^3)
    public static void printSubarraysMax(int arr[]) {
        int max=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                     sum +=arr[k];
                }
                max=Math.max(sum,max);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The max subarray sum is"+ max);
    }


    //Prefix Sum : Time Complexity O(n^2)
    // First Method:
    public static void prefixSum(int arr[]) {
        int max = Integer.MIN_VALUE; // Initialize to smallest possible integer to handle negative sums
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                System.out.print(sum + " ");
                max = Math.max(sum, max); // Update max inside the inner loop
            }
            System.out.println();
        }
        System.out.println("The max sum of prefixSum is " + max);
    }

    //Second Method :
    public static void prefixSum2(int arr[]){
        int max = Integer.MIN_VALUE;
        int prefixArr[] = new int[arr.length];
      
        // Prefix Sum Array
        prefixArr[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int currSum = (i == 0) ? prefixArr[j] : prefixArr[j] - prefixArr[i - 1];
                max = Math.max(max, currSum); 
            }
        }
        System.out.println("The max sum of prefixSum2 is " + max);
    }
    


    //Kadan's Algorithm : Time Complexity O(n)
      public static void kadansAlgo(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0; 

        for(int i=0;i<arr.length;i++){
            cs= cs +arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("The maximun sum of kadans Alog is"+ms);
      }



    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};

        // printPairs(arr);
        // printSubarrays(arr);
        // printSubarraysMax(arr);
        prefixSum(arr);
        // prefixSum2(arr);
         kadansAlgo(arr);
    }
}
