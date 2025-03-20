package PracticeQuestions.Array;

public class ThirdLargest {
    /*
Input: arr[] = {1, 14, 2, 16, 10, 20}
Output: 14
Explanation: Largest element is 20, second largest element is 16 and third largest element is 14

Input: arr[] = {19, -10, 20, 14, 2, 16, 10}
Output: 16
Explanation: Largest element is 20, second largest element is 19 and third largest element is 16

     */

    public static void main(String[] args) {
        int[] arr = {1, 14, 2, 16, 10, 20};
        System.out.println(thirdLargest(arr));
    }

    public static int thirdLargest(int[] arr) {
        int n = arr.length;

        int first = Integer.MIN_VALUE;
        for (int j : arr)if (j > first) first = j;

        int second = Integer.MIN_VALUE;
        for (int j : arr) if (j > second && j < first) second = j;

        int third = Integer.MIN_VALUE;
        for (int j : arr) if (j > third && j < second) third = j;

        return third;
    }

}
