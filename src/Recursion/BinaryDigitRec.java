package Recursion;

public class BinaryDigitRec {


    public static void main(String[] args) {
        System.out.println("Binary Digit: "+ binaryDigit(113));
    }

    public static int binaryDigit(int n) {
        if(n==0){
            return 0;
        }
        return n%2+10*binaryDigit(n/2);
    }




}
