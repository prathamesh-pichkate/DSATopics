// Ques: Given an integer array nums, return true if any value appears at least twice in the
    //   array, and return false if every element is distinct.

    //   Example 1: Input:nums = [1, 2, 3, 1]   Output: true


import java.util.*;
public class Practice1 {

    // Time complexity: O(n^2)
    public static boolean duplicate(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }


    //Time complexity :O(n) Space Complexity:O(n)
    public static boolean duplicate2(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String args[]){
        // int arr[]={1,2,4,1,6,7,5};
        int arr[]={1,2,3,4,5,6};
        // System.out.println(duplicate(arr));
        System.out.println(duplicate2(arr));
    }
}


//Question : 27.Remove Element
public int removeElement(int[] nums, int val) {
    int total=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
            nums[total]=nums[i];
            total++;
        }
    }
    return total;
}


//Question : 26. Remove Duplicates from sorted Array 
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int total = 1; 
        for (int curr = 1; curr < nums.length; curr++) {
            if (nums[curr] != nums[curr - 1]) {
                nums[total] = nums[curr];
                total++;
            }
        }
        return total;
    }
}
