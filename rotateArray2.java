class Solution {
    public void rotate(int[] nums, int k) {
        
        if(nums.length == 1) return;
        k = k % nums.length;
        
        //second solution:
        //store the last k elements of the array
        //move each element from index 0 to nums.length-(k+1) k places to the right 
        //add the stored last k elements back at the beginning of the array
        //O(n)
        
        int[] lastKTemp = new int[k];
        
        for(int i=0; i<k; i++) {
            lastKTemp[k-i-1] = nums[nums.length-1-i];
        }
        
        for(int i=nums.length-k-1; i>=0; i--) {
            nums[i+k] = nums[i];
        }
        
        for(int i=0; i<k; i++) {
            nums[i] = lastKTemp[i];
        }
    }
}