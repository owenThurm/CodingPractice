class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> nums = new HashMap();
        
        for(int i=0; i<numbers.length; i++) nums.put(numbers[i], i);
        
        for(int i=0; i<numbers.length; i++) {
            
            if(nums.containsKey(target-numbers[i]) && nums.get(target-numbers[i]) != i) {
                int indexTwo = nums.get(target-numbers[i])+1;
                
                
                return new int[] {i+1, indexTwo};
            }
            
        }
        return new int[] {-1, -1};
    }
}