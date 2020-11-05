class Solution {
    public boolean containsDuplicate(int[] nums) {
        //shitty O(n^2) solution lol
        //space is O(1) tho
        
        for(int num1 : nums) {
            int numCount = 0;
            for(int num2 : nums) {
                if(num2 == num1) numCount++;
            }
            if(numCount > 1) return true;
        }
        return false;
    }
}