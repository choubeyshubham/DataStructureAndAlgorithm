package DS.Recursion.RecursionCodingExercise;

public class power {
/*
Write a function called power which accepts a base and an exponent.
The function should return the power of the base to the exponent.
 This function should mimic the functionality of math.pow() -
  do not worry about negative bases and exponents.
 */
    public static void main(String[] args) {

    }

    public static int power(int base, int exp) {
        int result =1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }





}
