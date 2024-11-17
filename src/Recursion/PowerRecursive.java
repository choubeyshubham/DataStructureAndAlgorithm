package Recursion;

public class PowerRecursive {

    public static void main(String[] args) {


        System.out.println(powerRecursive(2,2));
    }

    public static int powerRecursive(int base, int exponent) {
        if (exponent <= 0|| base <= 0) {
            return 1;
        }
        return base * powerRecursive(base , exponent -1);
    }


}
