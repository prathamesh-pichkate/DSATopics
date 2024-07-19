import java.util.ArrayList;

public class Swap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        //Swap the number at given index:
        int index1 = 2;
        int index2 = 3;

        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);

        System.out.println(list);
        }
}
