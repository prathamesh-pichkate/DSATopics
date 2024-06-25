public class Methods{

    // 1. Length :length()
    public static void findLenght(String str1){
        System.out.println("The length of the string is"+str1.length());
    }

    //2. Concatenate :
    public static void concate(String str1, String str2){
        System.out.println(str1 + " "+str2);
        System.out.println(str1.concat(str2));
    }

    // 3. charAt :
    public static void findCharAt(String str1){
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
    }

    //4. Similar:
    public static boolean similar(String str1, String str2){
       if(str1.equals(str2)){
           return true;
       }
       return false;
    }

    //5. SubString:
    public static void SubString(String str1){
        System.out.println(str1.substring(0,3));
    }

    //6. Largest String: Lexicographically
    public static void compare(String fruits[]){
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println("The largest string is"+" "+largest);
    }



    public static void main(String[] args) {
       String str1="Hello";
       String str2="World!";
       String fruits[]={"apple","mango","banana","zankjb"};
       findLenght(str1);
       concate(str1, str2);
       findCharAt(str1);
       System.out.println(similar(str1, str2));
       SubString(str1);
       compare(fruits);
    }
}