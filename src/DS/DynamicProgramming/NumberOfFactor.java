package DS.DynamicProgramming;

public class NumberOfFactor {


    public int numberFactorTopDown(int[] dp,int n){
    if(n==0 || n==1 || n==2) return 1;
    if(n==3) return 2;

    if(dp[0]==0) {
        int sp1=numberFactorTopDown(dp,n-1);
        int sp2=numberFactorTopDown(dp,n-3);
        int sp3=numberFactorTopDown(dp,n-4);
        dp[n]=sp1+sp2+sp3;
    }

        return dp[n];
    }

    public int numberFactorTopDown(int n){
        int[] dp= new int[n+1];
        return numberFactorTopDown(dp,n);

    }

    public int numberFactorDownTop(int n){
        int[] dp = new int[n+1];
        dp[0]=dp[1]=dp[2]=1;
        dp[3]=2;
        for(int i=4;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-3]+dp[i-4];
        }
        return dp[n];
    }





}
