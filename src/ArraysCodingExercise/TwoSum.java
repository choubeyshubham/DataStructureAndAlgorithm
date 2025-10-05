package ArraysCodingExercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice.

Examples

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1]

     */

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSumOn(nums, target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] rs=new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    rs[0]=i;
                    rs[1]=j;
                    return rs;
//                    return new int[]{i, j};
                }
            }
        }


        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSumOn(int[] arr, int target) {//O(n)
       int n=arr.length;
       Map<Integer,Integer> map=new HashMap<>();
       int[] rs=new int[2];

        for (int i = 0; i < n; i++) {//2,7,11,15
            if (map.containsKey(target-arr[i])){
                rs[0]=i;
                rs[1]=map.get(target-arr[i]);
            }
            map.put(arr[i],i);
        }




        return rs;
    }


}
