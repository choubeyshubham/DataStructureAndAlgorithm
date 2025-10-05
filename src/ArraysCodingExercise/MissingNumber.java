package ArraysCodingExercise;

public class MissingNumber {
    /*
Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.

Example

myArray = {1,2,3,4,6}
findMissingNumberInArray(myArray, 6) // 5
Hint:

Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers.


     */

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,6};
        System.out.println(findMissingNumberInArray(myArray));

    }

    public static int findMissingNumberInArray(int[] arr) {
        int n= arr.length+1;
        int sum=(n*(n+1))/2;
        int acSum=0;
        for (int s : arr) {
            acSum+=s;
        }
        int res=sum-acSum;
        return res;
    }


}
