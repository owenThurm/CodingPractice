class Solution {
    public int removeElement(int[] nums, int val) {
        int scoutIndex = 0;
        int insertionIndex = 0;
        while(scoutIndex < nums.length) {
            if(nums[scoutIndex] == val) scoutIndex++;
            else {
                nums[insertionIndex] = nums[scoutIndex];
                scoutIndex++;
                insertionIndex++;
            }
        }
            return insertionIndex;
        }
    }