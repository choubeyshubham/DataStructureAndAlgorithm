package DS.Recursion.RecursionCodingExercise;

public class Fib {
    /*
Write a recursive function called fib which accepts a number and returns the nth number
in the Fibonacci sequence. Recall that the Fibonacci sequence is the sequence of
whole numbers 0,1, 1, 2, 3, 5, 8, ... which starts with 0 and 1, and where every number
thereafter is equal to the sum of the previous two numbers.


     */

    public static void main(String[] args) {

    }

    public int fib(int n) {
        if(n==1)return 1;

        return n+fib(n-1);




    }


}
