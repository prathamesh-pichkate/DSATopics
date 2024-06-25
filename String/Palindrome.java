public class Palindrome {
    public static boolean palindrome(String str){
        // Step 1: Convert to lowercase and remove non-alphanumeric characters
        // StringBuilder sb = new StringBuilder();

        String sb ="";
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
              sb +=Character.toLowerCase(c);
            }
        }

        int n=sb.length()/2;
        int i=0;
        while(i<=n){
            if(sb.charAt(i)!= sb.charAt(sb.length()-1-i)){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        System.out.println(palindrome(str));
    }
}
