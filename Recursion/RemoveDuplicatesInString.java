import java.util.*;
public class RemoveDuplicatesInString {
    public static String remove(String str,int idx, StringBuilder sb, boolean map[]){
        if(idx == str.length()-1){
            return sb.toString();
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == false){
            sb.append(currChar);
        }
        map[currChar - 'a'] = true;

        return remove(str, idx+1, sb, map);
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(remove(str, 0, new StringBuilder(""), new boolean[26]));
    }
}
