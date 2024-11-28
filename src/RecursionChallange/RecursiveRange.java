package RecursionChallange;

public class RecursiveRange {

    /*
    Write a function called recursiveRange which accepts a number and adds
    up all the numbers from 0 to the number passed to the function.
     */


    public static void main(String[] args) {


    }

    public int recursiveRange(int num) {
        int temp=0;
        for (int i=0;i<=num ;i++ ) temp+=i;

        return temp;
    }
}
