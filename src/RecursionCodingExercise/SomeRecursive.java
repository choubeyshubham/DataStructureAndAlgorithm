package RecursionCodingExercise;

import java.util.Arrays;

public class SomeRecursive {
    /*
Write a recursive function called someRecursive which accepts an array and a callback.
The function returns true if a single value in the array returns true when passed to
 the callback. Otherwise it returns false.

     */
    public static void main(String[] args) {
        OddFunction isOdd = new OddFunction();
        int[] arr={1,2,3,4};
        System.out.println(someRecursive(arr, isOdd));
    }

    public static boolean someRecursive(int[] arr, OddFunction odd) {
        if (arr.length == 0 ) return false;
        else if (odd.run(arr[0]) == false)return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
        else return true;
    }



}
 class OddFunction{

     public boolean run(int i) {

         return i % 2 == 1;
     }
 }
