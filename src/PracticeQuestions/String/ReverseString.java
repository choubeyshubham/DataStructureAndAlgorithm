package PracticeQuestions.String;

public class ReverseString {
    /*




     */
    public static void main(String[] args) {
        String a="abdcfe";
        String b="ShubhamChoubey";

        System.out.println(reverse(a));
        System.out.println(reverse(b));
    }

    public static String reverse(String str) {
        StringBuilder sb=new StringBuilder();

        for (int i = str.length()-1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();

    }





}
