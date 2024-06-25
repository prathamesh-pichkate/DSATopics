import java.util.*;
public class LinearSearch {
    public static int linearSearch(int arr[], int key) {
       for(int i=0;i<arr.length;i++){
           if(arr[i]==key){
               return i;
           }
       }
       return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the key to Search");
        int key=sc.nextInt();

        System.out.println(linearSearch(arr, key));
    }
}
