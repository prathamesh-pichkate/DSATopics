// Question : Find if any pair in a sorted arraylist has a target sum

import java.util.*;
public class PairSum {
    // Brute Force Approach:
    public static void pair(ArrayList<Integer> list , int target){
         for(int i=0;i<list.size();i++){
            for(int j=i;j<list.size();j++){
                if(list.get(i) + list.get(j) == target){
                    System.out.println(list.get(i) + " " + list.get(j) +" "+ "and the pair is"+"("+i+","+j+")");
                }
            }
         }
    }

    // 2. Two Pointer Approach:
    public static void pair2(ArrayList<Integer> list , int target){
        int lp = 0;
        int rp = list.size()-1;

        while (lp < rp) {
            if(list.get(lp) + list.get(rp) == target){
                System.out.println(list.get(lp) + " " + list.get(rp) +" "+ "and the pair is"+"("+lp+","+rp+")");
                break;
            }
            else if(list.get(lp) + list.get(rp) > target){
                rp--;
            }
            else{
                lp++;
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // pair(list, 5);
        pair2(list, 5);
    }
}
