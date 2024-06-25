import java.util.Arrays;

public class ReverseArray {
    
    // Time Complexity : O(n) and space complexity : O(n)
    public static void reverse(int arr[], int reverseArr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            reverseArr[i] = arr[n - 1 - i];
        }
    }


    // Time Complexity : O(n) and space complexity : O(1)
    public static void reverseSpace(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int reverseArr[] = new int[arr.length];

        reverse(arr, reverseArr);
        System.out.println("Reverse Array is: " + Arrays.toString(reverseArr));
         
        reverseSpace(arr);
        
    }
}
