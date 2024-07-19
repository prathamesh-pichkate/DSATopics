import java.util.LinkedList;
import java.util.ListIterator;

public class MergeSortLL {
    public static LinkedList<Integer> mergeSort(LinkedList<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        // Split the list into two halves
        LinkedList<Integer> left = new LinkedList<>();
        LinkedList<Integer> right = new LinkedList<>();
        int mid = list.size() / 2;
        ListIterator<Integer> iterator = list.listIterator();

        for (int i = 0; i < mid; i++) {
            left.add(iterator.next());
        }

        while (iterator.hasNext()) {
            right.add(iterator.next());
        }

        // Recursively sort both halves
        left = mergeSort(left);
        right = mergeSort(right);

        // Merge the sorted halves
        return merge(left, right);
    }

    public static LinkedList<Integer> merge(LinkedList<Integer> left, LinkedList<Integer> right) {
        LinkedList<Integer> merged = new LinkedList<>();
        ListIterator<Integer> leftIterator = left.listIterator();
        ListIterator<Integer> rightIterator = right.listIterator();
        Integer leftElement = leftIterator.hasNext() ? leftIterator.next() : null;
        Integer rightElement = rightIterator.hasNext() ? rightIterator.next() : null;

        while (leftElement != null && rightElement != null) {
            if (leftElement <= rightElement) {
                merged.add(leftElement);
                leftElement = leftIterator.hasNext() ? leftIterator.next() : null;
            } else {
                merged.add(rightElement);
                rightElement = rightIterator.hasNext() ? rightIterator.next() : null;
            }
        }

        while (leftElement != null) {
            merged.add(leftElement);
            leftElement = leftIterator.hasNext() ? leftIterator.next() : null;
        }

        while (rightElement != null) {
            merged.add(rightElement);
            rightElement = rightIterator.hasNext() ? rightIterator.next() : null;
        }

        return merged;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(7);
        ll.add(2);
        ll.add(3);
        ll.add(1);
        ll.add(9);
        ll.add(8);

        ll = mergeSort(ll);

        System.out.println(ll);
    }
}
