package PracticeQuestions.String;

public class StringRotations {
    /*
        Input: s1 = “abcd”, s2 = “cdab”
Output: true
Explanation: After 2 right rotations, s1 will become equal to s2.


     */

    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdab";

        System.out.println(rotate(a, b));

    }

    public static boolean rotate(String a, String b) {
        int n = a.length();
        for (int i = 0; i < n; ++i) {
            if (a.equals(b)) return true;
            char last = a.charAt(n - 1);
            a = last + a.substring(0, n - 1);
        }
        return false;
    }


}
