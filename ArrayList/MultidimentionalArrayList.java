import java.util.ArrayList;

public class MultidimentionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(21);
        list2.add(31);
        list2.add(41);
        list2.add(51);
        mainList.add(list2);

        System.out.println(mainList);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
           for(int j=0;j<currList.size();j++){
               System.out.print(currList.get(j)+" ");
           }
           System.out.println();
        }
    }
}
