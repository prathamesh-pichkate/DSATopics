// Question 2:
// Lonely Numbers in ArrayList(MEDIUM):
// You are given an integer array list nums.A number x is lonely when it appears only once,and no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist


import java.util.*;
public class LonelyNumberInArrayList {
    public static void lonelyNumber(ArrayList<Integer> list){
        for(int i = 0; i < list.size() ; i++){
            int currNumber = list.get(i);
            int xmin1 = currNumber - 1;
            int xplus1 = currNumber + 1;

            if(!list.contains(xmin1) && !list.contains(xplus1)){
                System.out.println(currNumber);
            }
        }
    }

    public static List<Integer> findLonely(int[] nums) {
        List<Integer> list = new ArrayList<>();
       for (int num : nums) {
           list.add(num);
       }
       
       List<Integer> lonelyNumbers = new ArrayList<>();
       for (int i = 0; i < list.size(); i++) {
           int currNumber = list.get(i);
           int xmin1 = currNumber - 1;
           int xplus1 = currNumber + 1;

           if (!list.contains(xmin1) && !list.contains(xplus1) && Collections.frequency(list, currNumber) == 1) {
               lonelyNumbers.add(currNumber);
           }
       }

       return lonelyNumbers;
   }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        // lonelyNumber(list);
         int nums[] = {1,3,5,3};
        System.out.println(findLonely(nums));
    }
}
