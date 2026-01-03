package DS.DivideAndConquer;

public class Main {

    public static void main(String[] args) {
        NumberFactor numberFactor = new NumberFactor();
//        System.out.println(numberFactor.waysToGet(4));
//        System.out.println(numberFactor.waysToGet(5));
//        System.out.println(numberFactor.waysToGet(6));




        //House Robber Problem
        HouseRobberProblem hr= new HouseRobberProblem();
        int[] houseNetWorth={6,7,1,30,8,2,4};
//        System.out.println(hr.maxMoney(houseNetWorth));


        //Convert to String operation problem
        ConvertStringProblem cp= new ConvertStringProblem();
//        System.out.println(cp.findMinOperations("table", " tbres"));


        //Knapsack problem
        ZeroOneKnapsack zk = new ZeroOneKnapsack();
        int[] profits={31,26,17,72};
        int[] weights={3,1,2,5};
        int maxProfit =zk.knapSack(profits,weights,7);
//        System.out.println(maxProfit);

    //-------------------------------
        LongestPalindromeSubsequence lps=new LongestPalindromeSubsequence();
//        System.out.println("Longest Palindrome Subsequence: "+lps.findLPSLength("elrmenmet"));
//        System.out.println("Longest Palindrome Subsequence: "+lps.findLPSLength("panama"));

//-------------------------------------
        int[][] arr={
                {4, 7, 8, 6, 4},
                {6, 7, 3, 9, 2},
                {3, 8, 1, 2, 4},
                {7, 1, 7, 3, 7},
                {2, 9, 8, 9, 3}
        };


        MinimumCost cost=new MinimumCost();
//        System.out.println(cost.findMinimumCost(arr, arr.length-1,arr[0].length-1 ));

        int[][] arr2={
                {4, 7, 1, 6},
                {5, 7, 3, 9},
                {3, 2, 1, 2},
                {7, 1, 6, 3}};

        int costy=25;
        NumberOfPathProblem np=new NumberOfPathProblem();
        System.out.println(np.numberOfPaths(arr2,arr2.length-1,arr2[0].length-1,costy));


    }


}
