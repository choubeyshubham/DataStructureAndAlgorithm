package DS.Recursion.RecursionCodingExercise;

public class FirstUppercase {

    /*
        Given a string find its first uppercase letter
     */
    public static void main(String[] args) {

    }

    public static char first(String str) {
        if (str.isEmpty()) return ' ';
        if (Character.isUpperCase(str.charAt(0))) return str.charAt(0);
        else return first(str.substring(1, str.length()));
    }


}
