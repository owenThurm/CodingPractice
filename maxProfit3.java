class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length == 0) return 0;
        
        //find the largest difference between two numbers in the prices 
        //array where the smaller number comes first
        
        //one pass solution -> O(n)
        //store the smallest number seen thus far
        //store the biggest difference seen thus far
        
        //if the number is less than the smallest number -> store new smallest number
        //if the difference is greater than the greatest difference -> store new greates difference
        int smallestNum = prices[0];
        int maxDif = 0;
        
        
        for(int price : prices) {
            if(price < smallestNum) smallestNum = price;
            else if(price - smallestNum > maxDif) maxDif = price - smallestNum;
        }
        return maxDif;
    }
    
}