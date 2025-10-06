package PracticeQuestions.String;


import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
    /*
Given a string in roman form, the task is to convert this given roman string into an integer.

Roman numerals are based on the symbols I, V, X, L, C, D, and M, which represent
 1, 5, 10, 50, 100, 500, and 1,000 respectively. Different arrangements of these symbols

 represent different numbers. The roman numbers I, II, III, IV, V, VI, VII, VIII, IX,
  and X represent 1, 2, 3, 4, 5, 6, 7, 8, 9 and 10 respectively.
     */

    public static void main(String[] args) {
//        String s="IX";
        String s="XI";
//        String s="X";
        System.out.println(conversion(s));

    }

    public static int conversion(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                res += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                i++;
            } else {
                res += map.get(s.charAt(i));
            }
        }

        return res;

    }
}
