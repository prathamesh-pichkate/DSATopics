import java.util.*;

public class RemoveDuplicate{
    public static boolean RemoveDuplicate(String str){
        Stack<Character> s = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //closing
            if(ch == ')'){
               int count = 0;
               while(s.peek() != '('){
                   s.pop();
                   count++;
               }
               if(count < 1){
                  return true;
               }else{
                  s.pop();
               }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))";  //true
        String str1 = "((a+b)+(h*f))";  //false
        System.out.println(RemoveDuplicate(str1));
    }
}