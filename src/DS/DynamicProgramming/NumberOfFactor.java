package DS.DynamicProgramming;

public class NumberOfFactor {


    public int numberFactor(int n,int[] dp){
    if(n==0 || n==1 || n==2) return 1;
    if(n==3) return 2;
    for (int d :dp){
        if(n==d) return dp[n];
    }


        int rec1=numberFactor(n-1,dp);
        int rec2=numberFactor(n-3,dp);
        int rec3=numberFactor(n-4,dp);
        dp[n]=rec1+rec2+rec3;
        return dp[n];


    }





}
