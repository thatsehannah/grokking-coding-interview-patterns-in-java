package two_pointers;

import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "Hello World!";
        String reversedString = reverseWords(s);
        System.out.println(reversedString);
    }

    static String reverseWords(String sentence) {
        String[] reversedString = sentence.split(" ");
        int leftPointer = 0;
        int rightPointer = reversedString.length - 1;

        while (leftPointer < rightPointer) {
            String temp = reversedString[leftPointer];
            reversedString[leftPointer] = reversedString[rightPointer];
            reversedString[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < reversedString.length; i++) {
            result.append(reversedString[i]).append(" ");
        }
        return result.toString();
    }
}
