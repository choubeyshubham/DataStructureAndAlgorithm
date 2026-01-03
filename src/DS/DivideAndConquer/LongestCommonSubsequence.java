package DS.DivideAndConquer;

public class LongestCommonSubsequence {
    /*
    S1 and S2 are given Strings
    Find the length of the longest subsequence which is common to both strings
    Subsequence: a sequence that can be driven from another
        sequence by deleting the elements without changing the order of them


     */

    private int findLCSLength(String s1,String s2, int len1,int len2){
        if (len1==s1.length()|| len2==s2.length()){
            return 0;
        }
        int c1=0;
        if (s1.charAt(len1)==s2.charAt(len2)){
            c1=1+findLCSLength(s1,s2,len1+1,len2+1);

        }
        int c2 =findLCSLength(s1,s2,len1,len2+1);
        int c3=findLCSLength(s1,s2,len1+1,len2);
        return Math.max(c1,Math.max(c2,c3));
    }

    public int findLCSLength(String s1,String s2) {
       return findLCSLength(s1,s2,0,0);
    }










}
