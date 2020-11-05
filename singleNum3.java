class Solution {
    public int singleNumber(int[] nums) {
        //Math approach:
        //I know every number except one appears twice
        //can get the sum in one pass
        //if the sum is odd I know the single number is odd
        //if the sum is even I know the single number is even
        //2 times every distinct number in the list - the sum of the list = the single number
        
        //loop through the list in one pass to get all of the distinct numbers
        Set<Integer> numbers = new HashSet<Integer>();
        
        for(int num : nums) if(!numbers.contains(num)) numbers.add(num);
        
        //store the value of twice every distinct number in the list
        int twiceVal = 0;
        
        //store iterator
        Iterator<Integer> iter = numbers.iterator();
        
        //accumulate the value of twice every distinct number in the list
        while(iter.hasNext()) twiceVal += 2 * iter.next();
        
        //store the value of the sum of the actual list
        int listVal = 0;
        
        //accumulate the value of every number in the list
        for(int num : nums) listVal += num;
        
        //return the difference between the sum of twice all of the distinct numbers
        //and the sum of every element in the list
        return twiceVal - listVal;
    }
}