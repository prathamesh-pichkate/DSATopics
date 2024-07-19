import java.util.ArrayList;

public class ContainerWithMostWater {

    ///Brute Force Approach:
    public static int mostWater(ArrayList<Integer> height){
        int max = 0;
        int volumn = 0; //height * distance

        for(int i=0;i<height.size();i++){
            for(int j=i;j<height.size();j++){
                volumn = Math.min(height.get(i),height.get(j)) * (j-i);
                if(max < volumn){
                    max = volumn;
                }
            }
        }
        return max;
    }


    // Two Pointer Approach:
    public static int mostWater2(ArrayList<Integer> height){
       int max = 0;
       int lp = 0;
       int rp = height.size()-1;

       while(lp < rp){
           int volumn = Math.min(height.get(lp),height.get(rp)) * (rp-lp);
           if(lp < rp){
             lp++;
           }else{
            rp--;
           }

           if(max < volumn){
               max = volumn;
           }
       }
       return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        // System.out.println("The max contains water is " + mostWater(height));
        System.out.println(mostWater2(height));
    }
}
