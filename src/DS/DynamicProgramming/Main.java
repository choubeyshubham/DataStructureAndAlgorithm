package DS.DynamicProgramming;


import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        DPMemo dpMemo = new DPMemo();
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    System.out.println(dpMemo.fibMemo(6,map));
    System.out.println(dpMemo.fibTab(6));


// ---------------Number Factor

    NumberOfFactor np=new NumberOfFactor();
        System.out.println(np.numberFactorTopDown(4));

        System.out.println(np.numberFactorDownTop(4));


    }








}
