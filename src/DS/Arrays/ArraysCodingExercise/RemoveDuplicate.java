package DS.Arrays.ArraysCodingExercise;

import java.util.Arrays;

public class RemoveDuplicate {
    /*
Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)

Example

Output : [1, 2, 3, 4, 5]

     */

    public static void main(String[] args) {
        int[] arr={1, 1, 2, 2, 3, 4, 5};

        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }


    public static int[] removeDuplicates(int[] arr) {
       int n = arr.length;
       int[] temp = new int[n];
       int index=0;

        for (int i = 0; i < n; i++) {
            boolean isDup=false;
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDup=true;
                    break;
                }
            }
            if (!isDup) {
                temp[index++]=arr[i];
            }

        }

        return Arrays.copyOf(temp, index);

    }

}


