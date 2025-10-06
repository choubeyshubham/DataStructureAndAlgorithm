package DS.Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        //--------------------23
        int[] intarray;
        intarray=new int[3];
        intarray[0]=1;
        intarray[1]=2;
        intarray[2]=3;
        System.out.println(intarray);
        System.out.println(Arrays.toString(intarray));
        System.out.println("====================\n");
        //--------------------

        SingleDimensionalArray sda=new SingleDimensionalArray(3);
        sda.insert(0,10);
        sda.insert(1,20);
        sda.insert(2,30);

        var fElement=sda.arr[0];
        System.out.println(fElement);
        var tElement=sda.arr[2];
        System.out.println(tElement);

        //==============================================

        System.out.println("===================\n");
        int[][] in2dArr=new int[3][3];
        in2dArr[0][0]=1;
        in2dArr[0][1]=2;
        in2dArr[0][2]=3;
        in2dArr[1][0]=3;
        in2dArr[1][1]=4;
        in2dArr[1][2]=5;
        in2dArr[2][0]=5;
        in2dArr[2][1]=6;
        in2dArr[2][2]=7;

        System.out.println(Arrays.deepToString(in2dArr));

        //===========================================
        System.out.println("===================\n");
        TwoDimensionalArray twoDArr= new TwoDimensionalArray(3,3);
        twoDArr.insertValueInTheArray(0,0,1);
        twoDArr.insertValueInTheArray(0,1,2);
        twoDArr.insertValueInTheArray(0,2,3);
        twoDArr.insertValueInTheArray(1,0,4);
        twoDArr.insertValueInTheArray(1,1,5);
        twoDArr.insertValueInTheArray(1,2,6);
        twoDArr.insertValueInTheArray(2,0,7);
        twoDArr.insertValueInTheArray(2,1,8);
        twoDArr.insertValueInTheArray(2,2,9);

        System.out.println(Arrays.deepToString(twoDArr.arr));

        twoDArr.traverseArray();

        twoDArr.deleteValue(0,1);


    }




}
