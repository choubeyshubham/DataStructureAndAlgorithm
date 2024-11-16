package Recursion;

public class RecursiveVsIterative {
    /*



     */
    public static void main(String[] args) {

        System.out.println(powerOfTwo(5));
        System.out.println(powOfTwoIterative(5));


    }
    //Recursive
    static int powerOfTwo(int n) {
        if (n==0){
            return 1;
        }else {
            return 2* powerOfTwo(n-1);
        }

    }

    //Iterator
    static int powOfTwoIterative(int n) {
        int i=0;
        int power=1;
        while(i<n) {
            power = power * 2;
            i = i + 1;
        }
        return power;

    }






}
