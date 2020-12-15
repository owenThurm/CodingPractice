class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap();
        for(int i=0; i<nums.length; i++) {
            if(numbers.containsKey(nums[i])) return new int[] {i, numbers.get(nums[i])};
            else numbers.put(target-nums[i], i);
        }
        return new int[0];
    }
}