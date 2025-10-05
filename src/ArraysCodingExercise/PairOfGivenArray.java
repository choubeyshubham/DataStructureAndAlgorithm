package ArraysCodingExercise;

public class PairOfGivenArray {
    /*



     */


    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        pairOfArray(arr);


    }

    public static void pairOfArray(int[] arr) {//O(N2)
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i]+" "+arr[j]+",");
                count++;
            }
        }
        System.out.println(count);

    }



}
