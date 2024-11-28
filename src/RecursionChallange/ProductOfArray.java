package RecursionChallange;

public class ProductOfArray {
/*
Write a function called productOfArray which takes in an array of numbers
 and returns the product of them all.
 */

    public static void main(String[] args) {


    }



    public  static int productofArray(int a[], int n)
    {
        int temp=1;
        for (int i=0;i<n ;i++ ){
            temp = temp * a[i];
            System.out.println(temp);
        }
        return temp;
    }


}

