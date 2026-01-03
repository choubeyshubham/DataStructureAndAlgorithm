package DS.GreedyAlgorithm.CodingExcercise;

import java.util.Arrays;

public class CoinProblem {


    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 1000};
        int n=2035;


        coinProblem(coins,n);

    }

    private static  void coinProblem(int[] coins, int n) {

        Arrays.sort(coins);
        int index = coins.length - 1;
        while (true) {
            int coinValue = coins[index];
            index--;
            int maxAmount = (n/coinValue)*coinValue;
            if (maxAmount > 0) {
                System.out.println("Coin Value: " + coinValue + " Taken Count: " + (n/coinValue));
                n -= maxAmount;
            }
            if (n==0) {
                break;
            }

        }




    }


}
