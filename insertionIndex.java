class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[0] > target) return 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) return i;
            else if(i>0 && nums[i-1] < target && nums[i] > target) return i;
            
        }
        return nums.length;
    }
}