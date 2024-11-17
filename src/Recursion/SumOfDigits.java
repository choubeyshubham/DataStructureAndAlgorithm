package Recursion;

public class SumOfDigits {
    /*
    How to find the sum of digits of a positive integer number using recursion?

    */
    public static void main(String[] args) {
        System.out.println("Sum of digits: " + sumOfDigits(415));
    }

    public static int sumOfDigits(int n) {
        if (n==0||n<0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }


}
