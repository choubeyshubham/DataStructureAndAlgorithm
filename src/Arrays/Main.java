package Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        SingleDimensionalArray sda= new SingleDimensionalArray(3);
        sda.insert(0,10);
        sda.insert(1,20);
        sda.insert(2,30);
//        sda.insert(1,30);
//        sda.insert(12,120);

        var firstElement =sda.arr[0];
//        System.out.println(firstElement);
//        var thirdElement=sda.arr[3];
//        System.out.println(thirdElement);
//
//        System.out.println("Array Traversal");
//        sda.traverseArray();

        //2D array

        int[][] twoDArr;
        twoDArr = new int[2][2];
        twoDArr[0][0]=1;
        twoDArr[0][1]=2;
        twoDArr[1][0]=3;
        twoDArr[1][1]=4;


        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(2, 2);
        twoDimensionalArray.insertValueInTheArray(0,0,10);
        twoDimensionalArray.insertValueInTheArray(0,1,100);
        twoDimensionalArray.insertValueInTheArray(1,0,90);
        twoDimensionalArray.insertValueInTheArray(1,1,70);

        System.out.println("=====================");

        twoDimensionalArray.traverseArray();



    }




}
