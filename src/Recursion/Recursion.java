package Recursion;

public class Recursion {
/*
    Recursion: A way of solving a problem by having a function calling itself

    When to choose Recursion?
    -> If you can divide the problem into similar sub problems
    ->Design an algorithm to compute the nth
    ->Write a code to list the n.
    ->implements methods to compute all

    Prominent usage o recursion is in datastructures like tree and graphs.
    It is used in many algorithms like divide and conquer, greedy and dynamic programing
 */

    public static void main(String[] args) {

        recursive(4);



    }
    static  void recursive(int n){
        if(n<1){
            System.out.println("n is less than 1");
        }else {
            recursive(n-1);
            System.out.println(n);
        }
    }



}
