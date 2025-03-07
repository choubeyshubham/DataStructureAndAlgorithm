package Arrays;

public class SingleDimensionalArray {

    /*


     */
    static int[] arr = null;

    public static void main(String[] args) {


    }

    public SingleDimensionalArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) {//O(1)
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


    //Array Traversal
    public  void traverseArray(){  //O(n)   space O(1)

        try {
            for (int j : arr) {
                System.out.println(j);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    /// Search Method
    public void SearchInArray(int valueToSearch) {//O(n)

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==valueToSearch){
                System.out.println(STR."Value is found at \{arr[i]}");
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




