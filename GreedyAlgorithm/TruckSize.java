import java.util.*;
public class TruckSize {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        int boxIdx[][] = new int[boxTypes.length][boxTypes.length];
        for(int i=0;i<boxIdx.length;i++){
            boxIdx[i][0] = i;
            boxIdx[i][1] = boxTypes[i][0];
            boxIdx[i][2] = boxTypes[i][1];
        }

         

        Arrays.sort(boxIdx, Comparator.comparingDouble(o -> o[2]));
         int finalSum = 0;
        for(int i=boxIdx.length-1;i>=0;i--){
            int idx = boxIdx[i][0];
            if(truckSize >= boxIdx[idx][1]){
               finalSum += boxIdx[idx][2] * boxIdx[idx][1];
               truckSize -= boxIdx[idx][1];
            }else{
                finalSum += truckSize * boxIdx[idx][2];
                truckSize = 0;
                break;
            }
        }
        return finalSum;
    }
    

public static void main(String args[]){
   int[][] boxTypes = {{1,3},{2,2},{3,1}};
   int truckSize = 4;
   System.out.println(maximumUnits(boxTypes,truckSize));
}
}
