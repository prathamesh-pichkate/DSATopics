public class Occurrence {


    /// First Occurance:
    public static int firstOccur(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccur(arr, i + 1, key);
    }


    /// Last Occurance :
    public static int lastOccur(int arr[], int i, int key) {
        if (i == 0) {
            return -1;
        }

        if(arr[i]==key){
            return i;
        }
        return lastOccur(arr, i-1, key);
    }

    

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 4, 5, 6, 7, 8, 5, 10 };
        int key = 5;
        // int i = 0;
        // int result = firstOccur(arr, i, key);

        int i=arr.length-1;
        int result =lastOccur(arr, i, key);

        if (result == -1) {
            System.out.println("Key not found in the array.");
        } else {
            // System.out.println("First occurrence of key " + key + " is at index: " + result);  //FO
            System.out.println("Last occurrence of key " + key + " is at index: " + result);  //LO
        }
    }
}
