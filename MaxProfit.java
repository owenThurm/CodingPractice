class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length == 1) return 0;
        
        //buy at local mins and sell at local maxes
        
        //in other words:
        //If not bought - buy if the value to the right is greater
        //if bought - sell if the value to the right is smaller
        boolean bought = false;
        int boughtVal = 0;
        int profit = 0;
        
        
        for(int i=0; i<prices.length; i++) {
            if(bought) {
                if(i == prices.length-1) profit+= prices[i] - boughtVal;
                else if(prices[i] > prices[i+1]) {
                    bought = false;
                    profit+= prices[i] - boughtVal;
                }
            } else {
                if(i == prices.length-1) return profit;
                else if(prices[i] < prices[i+1]) {
                    bought = true;
                    boughtVal = prices[i];
                }
            }
        }
        return profit;
    }
}