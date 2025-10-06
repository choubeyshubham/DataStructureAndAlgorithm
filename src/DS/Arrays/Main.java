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





    }




}
