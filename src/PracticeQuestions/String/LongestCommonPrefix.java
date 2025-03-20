package PracticeQuestions.String;

import java.util.Arrays;

public class LongestCommonPrefix {
    /*



     */
    public static void main(String[] args) {


        String[] arr = {"apple", "ape", "april"};

        System.out.println(prefixCheck(arr));

    }


    public static String  prefixCheck(String[] arr) {
        int n=arr.length;
        Arrays.sort(arr);

        String first=arr[0];
        String last=arr[n-1];
        int min = Math.min( first.length(),last.length());

        int i= 0;
        while (i<min && first.charAt(i)==last.charAt(i)) i++;
        return first.substring(0,i);

    }



}
