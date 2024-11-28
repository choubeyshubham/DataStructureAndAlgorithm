package RecursionChallange;

public class Reverse {

    /*
Write a recursive function called
 reverse which accepts a string and returns a new string in reverse.

     */

    public static void main(String[] args) {


    }

    public String reverse(String str) {
        if (str == null || str.length() <= 1) return str;
        System.out.println(str.substring(1));
        return reverse(str.substring(1)) + str.charAt(0);


    }

}
