package PracticeQuestions.String;

public class EncryptTheString_2 {
    /*
Given a lowercase English string s of length n, encrypt it as follows:

Replace each contiguous group of the same character with the character followed by the lowercase hexadecimal representation of its length.
Reverse the entire modified string.
Return the encrypted string.

Note: All Hexadecimal letters should be converted to Lowercase letters.

Examples:

Input: s = “aaaaaaaaaaa”
Output: ba
Explanation: Count consecutive characters: "aaaaaaaaaaa" → "a11".
Convert frequency to hexadecimal: "a11" → "ab".
Reverse the string: "ab" → "ba".

Time Complexity: O(n)
Auxiliary Space: O(n)

     */

    public static void main(String[] args) {
        String s1 = "aaaaaaaaaaa";
        String s2 = "abc";

        System.out.println(encryptString(s1));
        System.out.println(encryptString(s2));

    }

    public static String convertToHex(int num) {
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int digit = num % 16;
            if (digit < 10) {
                sb.append((char) (digit + '0'));
            } else {
                sb.append((char) (digit - 10 + 'a'));
            }
            num = num / 16;
        }
        return sb.reverse().toString();
    }

    public static String encryptString(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int count = 0;

            while (i < n && s.charAt(i) == c) {
                count++;
                i++;
            }
            i--;

            String hex = convertToHex(count);
            sb.append(c);
            sb.append(hex);

        }


        return sb.reverse().toString();

    }


}
