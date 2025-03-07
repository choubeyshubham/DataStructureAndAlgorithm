package Arrays;

public class Main {

    public static void main(String[] args) {

        SingleDimensionalArray sda= new SingleDimensionalArray(3);
        sda.insert(0,10);
        sda.insert(1,20);
        sda.insert(2,30);
        sda.insert(1,30);
        sda.insert(12,120);

        var firstElement =sda.arr[0];
        System.out.println(firstElement);
        var thirdElement=sda.arr[3];
        System.out.println(thirdElement);

        System.out.println("Array Traversal");
        sda.traverseArray();
    }




}
