package two_pointers;

public class ValidPalindrome2 {

    // Checks if string would be a palindrome by removing at most one character from it

    public static void main(String[] args) {
        System.out.println("Is madame still a palindrome if you remove one letter? " + isPalindrome2("madame"));
        System.out.println("Is RACEACAR a palindrome? " + isPalindrome2("RACEACAR"));
        System.out.println("Is abbababa a palindrome? " + isPalindrome2("abbababa"));
        System.out.println("Is abcdeca a palindrome? " + isPalindrome2("abcdeca"));
    }

    static boolean isPalindrome2(String s) {
        int mismatch = 0;
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer <= rightPointer) {
            if (s.charAt(leftPointer) != s.charAt(rightPointer)) {
                mismatch++;
                if (mismatch > 1) {
                    return false;
                }
                if (s.charAt(leftPointer) == s.charAt(rightPointer - 1)) { // if we move the right pointer over 1 extra position
                    rightPointer--;
                } else if (s.charAt(leftPointer + 1) == s.charAt(rightPointer)) { // if we move the left pinter over 1 extra position
                    leftPointer++;
                }
            } else {
                leftPointer++;
                rightPointer--;
            }
        }

        return true;
    }
}
