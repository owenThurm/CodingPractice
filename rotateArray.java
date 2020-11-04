class Solution {
    public void rotate(int[] nums, int k) {
        
        if(nums.length == 1) return;
        
        //iterative solution:
        //for each k > 0
        //store the last element temporarily
        //move every element over to the right one
        //set the first element to be the temporarily stored last element
        k = k % nums.length;
        
        
        for(int i=0; i<k; i++) {
            int lastTemp = nums[nums.length-1];
            for(int j=nums.length-2; j>=0; j--) {
                nums[j+1] =  nums[j];
            }
            nums[0] = lastTemp;
        }
        
        
    }
}