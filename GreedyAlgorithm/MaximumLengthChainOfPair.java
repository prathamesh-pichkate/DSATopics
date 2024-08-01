import java.util.Comparator;
import java.util.*;
public class MaximumLengthChainOfPair {

    public static int maxChain(int pairs[][]){
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

        int ans = 1; // added the first pair
        int lastIdx = pairs[0][1];
        for(int i=1;i<pairs.length;i++){
           if(lastIdx < pairs[i][0]){
               ans++;
               lastIdx = pairs[i][1];
           }
        }
        return ans;
    }
    public static void main(String[] args) {
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        System.out.println(maxChain(pairs));
    }
}
