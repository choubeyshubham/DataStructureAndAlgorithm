package PracticeQuestions.String;

public class FindAnEqualPointInAStringOfBrackets {
    /*
Given a string of brackets, the task is to find an index k which decides the number of opening brackets
is equal to the number of closing brackets.
The string must be consists of only opening and closing brackets i.e. ‘(‘ and ‘)’.

An equal point is an index such that the number of opening brackets before it is equal to the number of
closing brackets from and after.
If multiple such points exist then return the first valid index and if no such index exists then return -1.

Examples:

Input: str = “(())))(“
Output:   4
Explanation: After index 4, string splits into (()) and ))(. The number of opening brackets in the first part is equal to the number of closing brackets in the second part.





     */

    public static void main(String[] args) {
        String s1 = "(())))(";
        String s2 = "))";

        System.out.println(findEqlPoint(s1));
        System.out.println(findEqlPoint(s2));


    }

    public static int findEqlPoint(String s) {
       int n=s.length();
       int start=0,end=0;
       for(int i=0;i<n;++i)if(s.charAt(i)==')') end++;
       for(int i=0;i<n;i++){
           if(start==end) return i;
           if(s.charAt(i)=='(') start++;
           if(s.charAt(i)==')') end++;
       }
        return -1;
    }


}
