import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Stack<Character> s =new Stack<>();

        String str = "Hello";
        int i = 0;
        while(i < str.length()){
            s.push(str.charAt(i));
            i++;
        }


        StringBuilder newStr = new StringBuilder();
        while(!s.isEmpty()){
          char ch = s.pop();
          newStr.append(ch);
        //   s.pop();
        }

        System.out.println(newStr.toString());
    }
}
