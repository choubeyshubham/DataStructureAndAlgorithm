package PracticeQuestions.Array;

public class ReverseAnArray {
    /*
Given an array arr[] and an integer k, the task is to reverse every subarray formed by consecutive K elements.

Examples:

Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9], k = 3
Output: 3, 2, 1, 6, 5, 4, 9, 8, 7




     */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;

        reverseInGroups(arr, k);

        // Print modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }

    private static void reverseInGroups(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            // Reverse the sub-array
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }




    }


}
