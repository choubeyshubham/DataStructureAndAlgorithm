package Recursion;

import java.util.HashMap;
import java.util.Map;

public class UseAvoidRecursion {
/*
    Use Cases----
    When we can easily break down problem into a sub problem
    When we are fine with extra overhead (both time and space) that comes with it
    When we need a quick working solution instead of efficient one
    when we traverse a tree
    when we use memoization

    Avoid cases---
    If time and space complexity matter to us
    Recursion use more memory. If you use embedded memory. For example
    an application that takes more memory in phone is not efficient
    Recursion can be slow

    Factorial
    -> it is the product of all positive integers less than equal to n
    ->Denoted by N!
    ->0!=1
    n! = n * (n-1)*(n-2)*...*2*1
*/

    public static void main(String[] args) {

        System.out.println(factorial(3));

    }

    public static int factorial(int n) {
        if(n < 0) return -1;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }



}
