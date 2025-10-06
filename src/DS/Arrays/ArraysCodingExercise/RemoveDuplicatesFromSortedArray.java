package DS.Arrays.ArraysCodingExercise;

public class RemoveDuplicatesFromSortedArray {
/*
Remove Duplicates from Sorted Array - LeetCode 26
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length. Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.

Example:

Input: nums = [1, 1, 2]
Output: 2

 */

    public static void main(String[] args) {
        int[] arr ={1, 1, 2,3,3,4,5,5,6};

        System.out.println(removeDuplicates(arr));


    }


    public static int removeDuplicates(int[] arrs) {
      int n=arrs.length;
      int count=0;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && arrs[i] == arrs[i + 1]) {
                continue;
            }
            arrs[count++]=arrs[i];
        }
        return count;
    }








}
