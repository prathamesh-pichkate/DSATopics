import java.util.*;

public class PairSumSortedRoted {

    public static void pairSumRotated(ArrayList<Integer> list, int target) {
        int n = list.size();
        int lp = 0;
        int rp = 0;

        // Find the pivot
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                lp = i + 1; // The smallest element
                rp = i;     // The largest element
                break;
            }
        }

        // Initialize the pointers for the search
        int start = lp;
        int end = rp;

        while (start != end) {
            int currentSum = list.get(start) + list.get(end);

            if (currentSum == target) {
                System.out.println("The target is found at indices " + start + "," + end);
                return;
            } else if (currentSum < target) {
                start = (start + 1) % n;
            } else {
                end = (n + end - 1) % n;
            }
        }

        System.out.println("No such pair found.");
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        // Example: 11, 15, 6, 8, 9, 10
        pairSumRotated(list, 16);
    }
}
