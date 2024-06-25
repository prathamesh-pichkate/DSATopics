// Que 1 : For a given integer array of size N.You have to find all the occurrences(indices) of a given element(Key) and   print them.Use a recursive function to solve this

// int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
// int key = 2;


public class OccuranceIndices {
    public static void occuranceIdx(int arr[], int idx, int key){
        if(idx == arr.length){
            return;
        }
        
        if(arr[idx] == key){
           System.out.print(idx+" ");
        }

        occuranceIdx(arr, idx+1, key);
    }
    public static void main(String[] args) {
        int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        occuranceIdx(arr, 0, key);
    }
}
