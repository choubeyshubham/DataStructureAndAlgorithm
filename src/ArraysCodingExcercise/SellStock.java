package ArraysCodingExcercise;

public class SellStock {
    /*



     */

    public static void main(String[] args) {
        int[] arr={7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(arr));


    }

    public static int maxProfit(int[] prices) {
        int sell=0;
        int hold=Integer.MIN_VALUE;

        for (int price : prices) {
            sell = Integer.max(sell, hold + price);
            hold = Integer.max(hold, -price);
        }


        return sell;
    }



}
