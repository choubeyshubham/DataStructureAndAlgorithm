package Recursion;


import static java.lang.Math.max;

public class MeasureRecursiveCall {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,9,6,5,8,99};
        int n=arr.length;
        System.out.println(finMaxNumRec(arr,n));
    }

    public static int finMaxNumRec(int[] arr,int n){
        if(n==1){
            return arr[0];
        }
        return max(arr[n-1],finMaxNumRec(arr,n-1));



    }







}
