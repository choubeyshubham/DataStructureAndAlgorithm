package PracticeQuestions.Array;

import java.util.Arrays;

public class ProductTriplet {
    /*
        Input:  arr[ ] = [10, 3, 5, 6, 20]
Output: 1200
Explanation: Multiplication of 10, 6 and 20


Input:  arr[ ] =  [-10, -3, -5, -6, -20]
Output: -90


Input: arr[ ] =  [1, -4, 3, -6, 7, 0]
Output: 168


     */

    public static void main(String[] args) {
        int[] arr={1, -4, 3, -6, 7, 0};
        System.out.println(triplet(arr));


    }

    public static int triplet(int[] arr) {//O(N logN)
        int n = arr.length;
        Arrays.sort(arr);
        return Math.max( (arr[0] * arr[1] * arr[n - 1]) , (arr[n - 1] * arr[n - 2] * arr[n - 3]));
    }

    static int maxProduct(int[] arr) {
        int n = arr.length;
        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;
        int maxC = Integer.MIN_VALUE;
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j > maxA) {
                maxC = maxB;
                maxB = maxA;
                maxA = j;
            } else if (j > maxB) {
                maxC = maxB;
                maxB = j;
            } else if (j > maxC) {
                maxC = j;
            }
            if (j < minA) {
                minB = minA;
                minA = j;
            } else if (j < minB) {
                minB = j;
            }
        }
        return Math.max(minA * minB * maxA, maxA * maxB * maxC);
    }


}
