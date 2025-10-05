package ArraysCodingExercise;

import java.util.Arrays;

public class MiddleFunction {
    /*
    Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

myArray = [1, 2, 3, 4]
middle(myArray)  # [2,3].

     */

    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4};
        System.out.println(Arrays.toString(middle(arr)));




    }
    public static int[] middle(int[] array) {
        if(array.length<=2){
            return new int[0] ;
        }

        int[] middleArray = new int[array.length-2];

        int index=1;

        while(index<array.length-1){
            middleArray[index-1]= array[index];
            index++;
        }
        return middleArray;
    }


}
