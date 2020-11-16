class Solution {
    public int majorityElement(int[] nums) {
        
        if(nums.length == 1) return nums[0];
        
        Map<Integer, Integer> elementCounts = new HashMap();
        
        for(int num : nums) {
            if(!elementCounts.containsKey(num)) elementCounts.put(num, 1);
            else if(elementCounts.get(num) + 1 > nums.length/2) return num;
            else elementCounts.put(num, elementCounts.get(num)+1);
        }
        
        return -1;
    }
}