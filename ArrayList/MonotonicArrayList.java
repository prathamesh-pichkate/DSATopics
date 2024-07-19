// Monotonic ArrayList(EASY):
// An Arraylist is monotonic if it is either monotone increasing or monotone decreasing


import java.util.*;
public class MonotonicArrayList {

    public static boolean check(ArrayList<Integer> list) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                isIncreasing = false;
            }
            if (list.get(i) < list.get(i + 1)) {
                isDecreasing = false;
            }
        }

        return isIncreasing || isDecreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        System.out.println(check(list)); 

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(3);
        list2.add(2);
        list2.add(1);
        System.out.println(check(list2)); 
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(3);
        list3.add(2);
        list3.add(4);
        System.out.println(check(list3)); 
    }
}

