package DS.DivideAndConquer;

public class HouseRobberProblem {

    private int maxMoneyRecursive(int[] houseNetWorth, int currentIndex){
        if(currentIndex>= houseNetWorth.length){
            return 0;
        }
        int stealCurrenthouse=houseNetWorth[currentIndex]+maxMoneyRecursive(houseNetWorth, currentIndex+2);
        int skipCurrentHouse= maxMoneyRecursive(houseNetWorth, currentIndex+1);

        return Math.max(stealCurrenthouse, skipCurrentHouse);

    }


    public int maxMoney(int[] houseNetWorth){
        return maxMoneyRecursive(houseNetWorth, 0);
    }




}
