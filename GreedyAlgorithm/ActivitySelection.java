// The conceot of this problem can be used to solve the Disjoint problem, Max meeting in room

public class ActivitySelection {

    public static void maxActivities(int start[], int end[]) {
        int n = start.length;

        // Initially, select the first activity
        System.out.println("Selected activities:");
        System.out.println("A0");

       
        int lastSelectedEnd = end[0];

       
        for (int i = 1; i < n; i++) {
            if (start[i] > lastSelectedEnd) {
                System.out.println("A" + i);
                lastSelectedEnd = end[i]; 
            }
        }
    }

    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        maxActivities(start, end);
    }
}
