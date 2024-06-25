//Create, Print The Array, Remove, Print the key Value. 

import java.util.Arrays;

public class Operations{
    public static void main(String args[]) {
        //1.Create Array :
        int arr[] = new int[5];
        int arr1[] = {1, 2, 3, 4, 5};
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 55;
        
        //2.Print Array : Arrays.toString() method
        System.out.println(Arrays.toString(arr) + " ");

        //3.Update the value :
        arr[0] = 111;
    }
}
