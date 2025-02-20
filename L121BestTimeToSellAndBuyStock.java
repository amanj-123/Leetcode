public class L121BestTimeToSellAndBuyStock {
    //TC= O(n) SC=O(1)
    public int maxProfit(int[] prices) {
        int min= Integer.MAX_VALUE;
        int profit=0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min=prices[i];
            } else if(prices[i]-min >profit) {
                profit= prices[i]-min;
            }
        }
        return profit;
    }
}
