package ArraysCodingExercise;

public class MaxProductOfTwoIntegers {
    /*
Max Product of Two Integers
How to find maximum product of two integers in the array where all elements are positive.

Example

int[] intArray = {10,20,30,40,50};
maxProduct(intArray) // (40,50)


     */

    public static void main(String[] args) {
        int[] intArray = {10,20,30,40,50};

        System.out.println(maxProduct(intArray));


    }

    public static String maxProduct(int[] arr) {
        int maxProduct=Integer.MIN_VALUE;
        String pair = "";
        for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i]*arr[j]>maxProduct) {
                    maxProduct=arr[i]*arr[j];
                    pair=Integer.toString(arr[i])+","+Integer.toString(arr[j]);
                }
            }
        }
        return pair;

    }

}
