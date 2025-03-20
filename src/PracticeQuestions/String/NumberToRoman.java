package PracticeQuestions.String;

public class NumberToRoman {
    /*
Input : 9
Output : IX
Input : 40
Output : XL
Input :  1904
Output : MCMIV


     */

    public static void main(String[] args) {

        System.out.println(conversion(1904));

    }

    public static String conversion(int num) {
        String m[] = { "", "M", "MM", "MMM" };
        String c[] = { "",  "C",  "CC",  "CCC",  "CD",
                "D", "DC", "DCC", "DCCC", "CM" };
        String x[] = { "",  "X",  "XX",  "XXX",  "XL",
                "L", "LX", "LXX", "LXXX", "XC" };
        String i[] = { "",  "I",  "II",  "III",  "IV",
                "V", "VI", "VII", "VIII", "IX" };

        String thousands = m[num / 1000];
        String hundreds = c[(num % 1000) / 100];
        String tens = x[(num % 100) / 10];
        String ones = i[num % 10];

        String ans=thousands+hundreds+tens+ones;
        return ans;
    }



}
