import java.util.Set;
import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        int scoutIndex = 0;
        int insertionIndex = 0;
        Set<Integer> previousNums = new HashSet<Integer>();
        while(scoutIndex < nums.length) {
            if(previousNums.contains(nums[scoutIndex])) {
                scoutIndex++;
            } else {
                nums[insertionIndex] = nums[scoutIndex];
                previousNums.add(nums[scoutIndex]);
                insertionIndex++;
                scoutIndex++;
            }
        }
        return insertionIndex;
    }
}