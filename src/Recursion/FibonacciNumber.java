package Recursion;

public class FibonacciNumber {


    public static void main(String[] args) {

        System.out.println(fibonacciNumber(6));

    }

    public static int fibonacciNumber(int n) {
        if (n<0){
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);


    }

}
