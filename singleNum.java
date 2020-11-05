class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> numbers = new HashSet<Integer>();
        
        for(int num : nums) {
            if(numbers.contains(num)) numbers.remove(num);
            else numbers.add(num);
        }
        
        return numbers.iterator().next();
        
    }
}