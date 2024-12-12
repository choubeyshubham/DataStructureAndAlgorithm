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
            System.out.println(" The value of "+value+" has been inserted");
        }
        else {
            System.out.println("Binary tree is full");
        }
    }

    //preOrder Traversal
    public void preOrder(int index) {
        if(index>lastUsedIndex){
            return;
        }
        System.out.print(arr[index]+" ");
        preOrder(index*2);
        preOrder(index*2+1);


    }

    //InOrder Traversal
    public void inOrder(int index) {
        if(index>lastUsedIndex){
            return;
        }
        inOrder(index*2);
        System.out.print(arr[index]+" ");
        inOrder(index*2+1);
    }

    //Post Traversal
    public void postOrder(int index) {
        if(index>lastUsedIndex){
            return;
        }
        postOrder(index*2);
        postOrder(index*2+1);
        System.out.print(arr[index]+" ");
    }

    //Level order Travesal
    public void levelOrder() {
        for (int i = 1; i <=lastUsedIndex; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    //Search Method
    public int search(String value) {
        for (int i = 1; i < lastUsedIndex; i++) {
            if (arr[i]==value) {
                System.out.print(value+" exist at location: "+i+".");
                return i;
            }
        }
        System.out.print("Value not found");
        return -1;
    }

    //Delete Method of specific node
    public void delete(String value) {
        int location = search(value);
        if (location == -1) {
            return;
        }else {
            arr[location]=value;
            lastUsedIndex--;
            System.out.print("The value of "+value+" has been deleted");
        }
    }

    //Delete whole binary tree
    public void deleteBinaryTree() {
        try {
            arr=null;
            System.out.println("Binary tree is deleted");
        }catch (Exception e) {
            System.out.println("Error! Binary tree is not deleted");
        }
    }


    //End of class
}
