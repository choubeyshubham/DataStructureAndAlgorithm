package Tree.BinaryTreeArray;

public class BinaryTreeArray {
    String[] arr;
    int lastUsedIndex;

    public BinaryTreeArray(int size) {
        arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Blank Tree of size " + size + " has been created");

    }

    //isFull
    public boolean isFull() {
        if (arr.length - 1 == lastUsedIndex) {
            return true;
        } else {
            return false;
        }
    }

    //Insert Method
    public void insert(String value) {
        if (!isFull()) {
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println("The value of "+value+" has been inserted");
        }
        else {
            System.out.println("Binary tree is full");
        }
    }




    //End of class
}
