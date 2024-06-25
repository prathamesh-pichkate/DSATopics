public class Permutation {
   static int count = 0;

    public static void totalPermutes(String str,String ans){
       if(str.length()==0){
          System.out.println(ans+" ");
          count++;
          return;
       }

       //recursion:
       for(int i=0;i<str.length();i++){
          char curr = str.charAt(i);
          String newStr = str.substring(0, i) + str.substring(i+1);
          totalPermutes(newStr, ans+curr);
       }
    }
    public static void main(String[] args) {
        String str = "abc";
        totalPermutes(str, "");
        System.out.println("Total permutates : " +count);
    }
}
