// Que: Print out the sum of the numbers inthe second row of the “nums” array.
// Example :
// Input - int[][] nums = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };
// Output - 26

public class PrintSum {
    public static int sum(int[][] nums,int n,int m){
        int sum=0;
        for(int i=0;i<m;i++){
            sum+=nums[1][i];
        }
        return sum;
    }
    public static void main(String args[]){
        int[][] nums = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };
        int n=nums.length;
        int m=nums[0].length;
        System.out.println(sum(nums, n, m));
    }
}
