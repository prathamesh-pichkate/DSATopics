import java.util.ArrayList;

public class FindTheMaximum {
    public static int maximum(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max = list.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(1);
        list.add(22);
        list.add(6);
        list.add(9);
        list.add(54);
        
        System.out.println(maximum(list));

    }
}
