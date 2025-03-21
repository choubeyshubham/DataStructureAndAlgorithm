package ArraysCodingExcercise;

import java.util.Arrays;

public class RotateMatrix {
    /*
Rotate Matrix
Given an image represented by an NxN matrix write a method to rotate the image by 90 degrees.

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.

DO NOT allocate another 2D matrix and do the rotation.


     */


    public static void main(String[] args) {

        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(rotateMatrix(arr));

    }

    public static boolean rotateMatrix(int[][] matrix) {

        if(matrix.length == 0||matrix.length != matrix[0].length ) {
            return false;
        }
        int n = matrix.length;
        for(int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1-layer;
            for(int i = first; i < last; i++) {
                int offset = i-first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        return true;
    }
}
