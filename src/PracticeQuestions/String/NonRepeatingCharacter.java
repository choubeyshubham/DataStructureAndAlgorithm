package PracticeQuestions.String;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {

    /*



     */

    public static void main(String[] args) {
        String str = "geeksforgeeks";

        System.out.println(nonRepO2(str));
        System.out.println("======================================");
        System.out.println(nonRepO1(str)) ;


    }


    public static char nonRepO2(String str) {
        int n= str.length();

        for (int i = 0; i < n; i++) {
            boolean isFound=false;
            for (int j = i+1; j < n; j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isFound=true;
                    break;
                }
            }
            if (isFound == false) {
                return str.charAt(i);
            }
        }

        return '#';
    }



    private static char nonRepO1(String str) {
        int MAX_CHAR=26;
        int[] freq=new int[MAX_CHAR];

        for (char c : str.toCharArray()) {
            freq[c-'a']++;
        }

        for (int i = 0; i < str.length(); ++i) {
            if (freq[str.charAt(i) - 'a'] == 1) {
                return str.charAt(i);
            }
        }
        return '#';
    }

}
