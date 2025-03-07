package Arrays;

public class TwoDimensionalArray {

    /*



     */

    static int[][] arr = null;

    public TwoDimensionalArray(int numOfRow, int numOfColumn) {
        this.arr = new int[numOfRow][numOfColumn];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    //Inserting data into 2D Array
    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("Value is inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException(e.getMessage());
        }
    }

    //Accessing cell value from given array
    public void accessCell(int row, int col) {//O(1)
        try {
            System.out.println("\nAccess Row " + row + ", col#" + col);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException(e.getMessage());
        }
    }

    //Traverse Two dimensional Array
    public void traverseArray(){//O(n2)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(STR."\{arr[i][j]} ");
            }
            System.out.println();
        }
    }

    //Searching a single value in a 2D Array
    public void searchingValue(int value){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]==value){
                    System.out.println("Value is found at row: "+i+" Col: "+j);
                    return;
                }
            }
        }
        System.out.println("Value is not found");

    }

    //Deleting a array element in 2D array
    public void deleteValue(int row, int col){//0(1)
        try{
            System.out.println("Successful deleted: "+arr[row][col]);
            arr[row][col]=Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException(e.getMessage());
        }


    }


}



