public class ArraySorted {
    public static boolean sorted(int arr[],int n,int i){
        if(n == 0 || n == 1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return sorted(arr,n-1,i+1);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n=arr.length;
        int i=0;
        System.out.println(sorted(arr, n, i));
    }
}
