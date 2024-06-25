public class FirstLetterUpperCase{
    public static String upperCase(String str){
       String str1="";
       char a=Character.toUpperCase(str.charAt(0));
       str1+=a;

       for(int i=1;i<str.length();i++){
          if(str.charAt(i)==' ' && i<str.length()-1){
             str1+=str.charAt(i);
             i++;
             char b=Character.toUpperCase(str.charAt(i));
             str1+=b;
          }
          else{
             str1+=str.charAt(i);
          }
       }
       return str1;
    }

    public static String upperCaseBuilder(String str){
        StringBuilder str1 =new StringBuilder();
        char a=Character.toUpperCase(str.charAt(0));
        str1.append(a);
 
        for(int i=1;i<str.length();i++){
           if(str.charAt(i)==' ' && i<str.length()-1){
              str1.append(str.charAt(i));
              i++;
              char b=Character.toUpperCase(str.charAt(i));
              str1.append(b);
           }
           else{
              str1.append(str.charAt(i));
           }
        }
        return str1.toString();
     }

    
    public static void main(String[] args) {
        String str = "i am prathamesh pichkate";
        // System.out.println(upperCase(str));
        System.out.println(upperCaseBuilder(str));
    }
}