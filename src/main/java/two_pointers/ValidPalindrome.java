package two_pointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println("Is racecar a palindrome? " + isPalindrome("racecar"));
        System.out.println("Is abba a palindrome? " + isPalindrome("abba"));
        System.out.println("Is tart a palindrome? " + isPalindrome("tart"));
        System.out.println("Is A a palindrome? " + isPalindrome("A"));
    }

    static boolean isPalindrome(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer <= rightPointer) {
            if (s.charAt(leftPointer) != s.charAt(rightPointer)) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }

        return true;
    }
}
