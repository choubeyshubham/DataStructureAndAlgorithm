package ArraysCodingExercise;

public class SumAndProduct {
    /*



     */
    public static void main(String[] args) {

        int[] arr={1,3,4,5};
        spofArray(arr);


    }

    public static void spofArray(int[] arr) {
        int sum=0;
        int product =1;
        for (int s:arr){
            sum+=s;
        }
        for (int p : arr) {
            product *=p;
        }
        System.out.println(sum + ", "+product);
    }






}
