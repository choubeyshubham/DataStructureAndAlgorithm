package DS.DivideAndConquer;

import java.util.ArrayList;

public class MinimumCost {
    /*
    2d matrix is given
    each cell has a cost associated with it for
      
     */

    public int findMinimumCost(int[][] costs,int row, int col) {
        if (row == -1 ||col == -1) {
            return Integer.MAX_VALUE;
        }
        if(row==0 && col==0){
            return  costs[0][0];
        }
        int minCost1=findMinimumCost(costs,row,col-1);
        int minCost2=findMinimumCost(costs,row-1,col);
        int minCost3=Integer.min(minCost1,minCost2);

        return minCost3+costs[row][col];

    }


}
