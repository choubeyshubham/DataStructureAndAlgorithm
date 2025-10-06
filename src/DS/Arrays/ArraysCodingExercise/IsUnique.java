package DS.Arrays.ArraysCodingExercise;

public class IsUnique {
    /*
IsUnique / Contains Duplicate - LeetCode 217
Write a program to check if an array is unique or not.

Example

int[] intArray = {1,2,3,4,5,6};
isUnique(intArray) // true


     */

    public static void main(String[] args) {



    }


    public boolean isUnique(int[] intArray) {
        boolean isUnique=true;
        for(int i=0;i<intArray.length;i++){
            for (int j=i+1;j<intArray.length;j++){
                if(intArray[i]==intArray[j]){
                    isUnique=false;
                }
            }
        }

        return isUnique;    }

}


