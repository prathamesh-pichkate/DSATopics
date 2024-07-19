import java.util.*;
public class SortingArrayList {

   
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(1);
        list.add(22);
        list.add(6);
        list.add(9);
        list.add(54);
        
         //Inbuild Function:
         Collections.sort(list);
         System.out.println(list);
         //sort in reverse order:
         Collections.sort(list, Collections.reverseOrder());
         System.out.println(list);
    }
}
