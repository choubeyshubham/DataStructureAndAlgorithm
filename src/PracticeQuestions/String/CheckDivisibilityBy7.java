package PracticeQuestions.String;

public class CheckDivisibilityBy7 {
    /*
Given a number N, the task is to check if it is divisible by 7 or not.
Note: You are not allowed to use the modulo operator, floating point arithmetic is also not allowed.

Naive approach: A simple method is repeated subtraction. Following is another interesting method.
Divisibility by 7 can be checked by a recursive method. A number of the form 10a + b is divisible by 7 if and only if a – 2b is divisible by 7. In other words, subtract twice the last digit from the number formed by the remaining digits. Continue to do this until a small number.

Example: the number 371: 37 – (2×1) = 37 – 2 = 35; 3 – (2 × 5) = 3 – 10 = -7; thus, since -7 is divisible by 7, 371 is divisible by 7.
Following is the implementation of the above method


     */

    public static void main(String[] args) {
        int num = 616;
        int num2 = 617;

        System.out.println(isDivisibleBy7(num)? "Divisible" : "Not Divisible");
        System.out.println(isDivisibleBy7(num2)? "Divisible" : "Not Divisible");
    }

    private static boolean isDivisibleBy7(int num) {
        if (num < 0) {
           return isDivisibleBy7(-num);
        }
        if (num == 0||num == 7) return true;
        if (num <10) return false;

        return isDivisibleBy7((num/10-2)*(num-num/10*10));
    }


}



