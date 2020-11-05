class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        for(int num : nums) {
            if(numbers.contains(num)) numbers.remove(numbers.indexOf(num));
            else numbers.add(num);
        }
        
        return numbers.get(0);
        
    }
}