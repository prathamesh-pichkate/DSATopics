
public class LengthOfString {
    public static int lengthOfStr(String str){
         if(str.length()==0){
            return 0;
         }

         return lengthOfStr(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(lengthOfStr(str));
    }
}
