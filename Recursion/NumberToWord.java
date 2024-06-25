// Question : You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.  Use a recursive function to solve this problem.

// Note : The digits of the number will only be in the range 0-9 and the last digit of a number can’t be 0;
// Sample Input: 1947
// Sample Output: “one nine four seven”


public class NumberToWord{
    public static String numberToWords(int number) {
        String[] digitWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if (number == 0) {
            return "";
        }
        int lastDigit = number % 10;
        String word = digitWords[lastDigit];
        String previousWords = numberToWords(number / 10);
        if (!previousWords.isEmpty()) {
            word = " " + word;
        }
        return previousWords + word;
    }

    public static void main(String[] args) {
        int number = 190264357;
        if (number == 0) {
            System.out.println("zero");
        } else {
            System.out.println(numberToWords(number));
        }
    }
}

