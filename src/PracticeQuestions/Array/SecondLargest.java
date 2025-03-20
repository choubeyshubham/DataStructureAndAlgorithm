package PracticeQuestions.Array;

public class SecondLargest {
    /*
Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.


Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.


Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 there is no second largest element.


     */
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(sLargest(arr));


    }

    public static int sLargest(int[] arr) {
        int n = arr.length;
        int largest = -1;
        int secondLargest = -1;
        for (int l : arr) {
            if (l > largest) largest = l;
        }
        for (int j : arr) {
            if (j > secondLargest && j != largest) secondLargest = j;
        }
        return secondLargest;
    }


}
