class Solution {
    public int maxProfit(int[] prices) {
        
        //find the largest difference between two numbers in the prices 
        //array where the smaller number comes first
        
        
        //naive n^2 solution:
        
        //store a max difference value
        int maxDif = 0;
        
        //loop through the prices, for every price if there is a price after it
        //that is > maxDif larger than it, set the maxDif to that value
        for(int i=0; i<prices.length; i++) {
            for(int j=i; j<prices.length; j++) {
                if(prices[j] - prices[i] > maxDif) maxDif = prices[j] - prices[i];
            }
        }
        
        
        //return maxDif
        return maxDif;
        
        
        
    }
}