import java.util.*;
public class StringBuilderMethod {
    public static void main(String[] args) {
        // Using StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(6, "Java ");
        sb.delete(0, 6);
        System.out.println("StringBuilder result: " + sb.toString());  // Output: Java World

        // Using StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        sbf.insert(6, "Java ");
        sbf.delete(0, 6);
        System.out.println("StringBuffer result: " + sbf.toString());  // Output: Java World
    }
}
