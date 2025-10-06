package DS.Recursion.RecursionCodingExercise;

public class IsPalindrome {
    /*
Write a recursive function called isPalindrome which returns true if the string
passed to it is a palindrome (reads the same forward and backward).
 Otherwise it returns false.
     */

    public static void main(String[] args) {


    }

    public boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) return true;
        System.out.println(s);
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        return isPalindrome(s.substring(1, s.length() - 1));


    }


}
