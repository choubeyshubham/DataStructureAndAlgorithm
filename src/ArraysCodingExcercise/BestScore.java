package ArraysCodingExcercise;

import java.util.Arrays;

public class BestScore {
    /*
Given an array, write a function to get first, second best scores from the array and return it in new array.

Array may contain duplicates.

Example

myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
firstSecond(myArray) // {90, 87}


     */
    public static void main(String[] args) {
        int[] myArray = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
        System.out.println(Arrays.toString(findTopTwoScores(myArray)));

    }

    public static int[] findTopTwoScores(int[] array) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for (int value : array) {
            if (value>first){
                second=first;
                first=value;
            } else if (value>second&& value<first) {
                second=value;
            }
        }
        return new int[]{first,second};
    }
}
