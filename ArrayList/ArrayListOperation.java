// ArrayList in java
import java.util.ArrayList;

public class ArrayListOperation{
    public static void main(String[] args){
        // Java collection framework:
        ArrayList<Integer> list = new ArrayList<>(); //Define

        //  1. Add   O(1)
        list.add(1);
        list.add(2);
        list.add(14);
        list.add(21);
        list.add(15);
        list.add(22);
        System.out.println(list);

        // 2.Get  O(1)
        System.out.println(list.get(0));
        System.out.println(list.get(5));


        // 3.Remove O(n)
        list.remove(0);
        System.out.println(list);


        // 4.Set element at index O(n)
        list.set(0, 10);
        System.out.println(list);

        // 5.Containes element O(n)
        System.out.println(list.contains(15));
        System.out.println(list.contains(100));

        // Find the Size() of an arraylist:
        System.out.println(list.size());
    }
}