package RecursionCodingExercise;

public class CodingExcercise38_Power {

    public static void main(String[] args) {
        System.out.println(power(2,0)); // 1
        System.out.println(power(2,2)); // 4
        System.out.println(power(2,4)); // 16


    }

    public static int power(int base, int exp) {
        int result =1;

        for (int i = 1; i <= exp; i++) {
            result *= base;

        }
        return result;

    }






}
