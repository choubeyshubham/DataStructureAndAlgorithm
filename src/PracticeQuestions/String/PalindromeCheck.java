package PracticeQuestions.String;

public class PalindromeCheck {
    /*


     */

    public static void main(String[] args) {
        String s = "acca";
        String b = "abc";

        System.out.println(palindrome(b));
        System.out.println(palindrome(s));


    }

    public static boolean palindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
