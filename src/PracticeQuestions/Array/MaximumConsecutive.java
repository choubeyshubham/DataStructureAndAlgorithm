package PracticeQuestions.Array;

public class MaximumConsecutive {
    /*
Input: arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1}
Output: 4
Explanation: The maximum number of consecutive 1’s in the array is 4 from index 8-11.


Input: arr[] = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1}
Output: 2
Explanation: The maximum number of consecutive 0’s in the array is 2 from index 0-1.

    */
    public static void main(String[] args) {
        int[] arr={1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};

        System.out.println(maxConsecutiveCount(arr));
    }

    public static int maxConsecutiveCount(int[] arr) {
        if (arr.length == 0) return 0; // Handle edge case
        int maxCount = 0, count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }

        return Math.max(maxCount, count);


    }

}
