public class ReverseString {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse(str));
    }
}
