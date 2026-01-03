package DS.DivideAndConquer;

public class LongestPalindromeSubsequence {
/*
S is given string
find the longest palindromic subsequence(LPS)
Subsequence: a sequence that can be driven from another
  sequence by deleting some elements without changing the order of them
Palindrome is a string that reads the same backward as well as forward

 MADAM

 */
    private int findLPSLength(String s1,int sI,int eI){
        if(sI>eI){
            return 0;
        }
        if(sI==eI){
            return 1;
        }
        int count1=0;
        if(s1.charAt(sI)==s1.charAt(eI)){
            count1=2+findLPSLength(s1,sI+1,eI-1);
        }
        int count2= findLPSLength(s1,sI+1,eI);
        int count3= findLPSLength(s1,sI,eI-1);

        return Math.max(count1,Math.max(count2,count3));
    }

    public int findLPSLength(String st){
        return findLPSLength(st,0,st.length()-1);
    }









}
