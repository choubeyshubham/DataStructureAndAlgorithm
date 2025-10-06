package DS.BigONotation;

public class PairSumSequence {



    public static void main(String[] args) {
        System.out.println(pairSumSequence(3));

    }

    public static int pairSumSequence(int n) {
        int total=0;
        for (int i = 0; i <= n; i++) {
            total=total+pairSum(i,i+1);
        }
        return total;
    }

    private static int pairSum(int a,int b) {
        return a+b;
    }
    //example
    public static void findTotalNumber(int n){
        int total=0;

        for (int i = 0; i <= n; i++) {
            total+=i;
        }
        if (total > 100) {
            System.out.println("The total number is greater than 100");
        }else {
            System.out.println(total);
        }


    }



}
