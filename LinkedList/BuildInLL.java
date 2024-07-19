import java.util.LinkedList;

public class BuildInLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        // 1. Add Operation:
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        // 2.addFirst & addlast:
        ll.addFirst(11);
        ll.addLast(55);
        System.out.println(ll);

        // 3.removeFirst & removeLast:
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
     }
}
