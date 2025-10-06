package DS.Arrays;

import java.util.Arrays;

public class SingleDimensionalArray {

    /*


     */
    static int[] arr = null;

    public static void main(String[] args) {


    }

    //initialize array with minimum value
    public SingleDimensionalArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        Arrays.fill(arr, Integer.MIN_VALUE);
    }


//    O(1) array insertion
    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            }else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException(e.getMessage());
        }
    }


    //Array Traversal //O(n)   space O(1)
    public  void traverseArray(){

        try {
            for (int j : arr) {
                System.out.println(j);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    // Search Method //O(n)
    public void SearchInArray(int valueToSearch) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==valueToSearch){
                System.out.println("Value is found at "+arr[i]);
                return;
            }
        }
        System.out.println(valueToSearch+ " is not found");
    }

    //Delete vale from Array
    public void delete(int valueToDelete) {//O(1)
        try {
            arr[valueToDelete]=Integer.MIN_VALUE;
            System.out.println("The value is deleted");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException(e.getMessage());
        }
    }














}




