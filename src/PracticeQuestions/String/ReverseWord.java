package PracticeQuestions.String;

import java.util.Arrays;
import java.util.Stack;

public class ReverseWord {
    /*

     */
    public static void main(String[] args) {

        String s = "i.like.this.program.very.much";

        System.out.println(reverseWord(s));


    }

    public static String reverseWord(String str) {
        Stack<String> stack = new Stack<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '.')
                word.append(str.charAt(i));
            else if (word.length() > 0) {
                stack.push(word.toString());
                word.setLength(0);
            }
        }
        if (word.length() > 0)
            stack.push(word.toString());
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            if (!stack.isEmpty())
                sb.append(".");
        }
        return sb.toString();
    }




}
