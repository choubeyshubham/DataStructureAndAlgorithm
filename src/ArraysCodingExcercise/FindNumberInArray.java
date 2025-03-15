package ArraysCodingExcercise;

public class FindNumberInArray {

    /*
    Finding a Number in an Array
Write a program to to check if an array contains a number in Java.

int[] intArray = {1,2,3,4,5,6};
searchInArray(intArray, 6); /


     */

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        System.out.println(searchInArray(intArray, 6));

    }

    public static int searchInArray(int[] intArray, int valueToSearch) {
        int n= intArray.length;

        for (int i = 0; i < n; i++) {
            if (intArray[i]==valueToSearch){
                return i;
            }
        }
        return -1;

    }

}
