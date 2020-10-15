class Solution {
    public int majorityElement(int[] nums) {
        //Store all of the element counts in a hashmap 
        //where the key is the number and the value is the appearances
        Map<Integer, Integer> elementCounts = new HashMap();
        
        //populate the hashmap with the occurences for each value
        for(int num : nums) {
            if(elementCounts.containsKey(num)) elementCounts.replace(num, elementCounts.get(num) + 1);
            else elementCounts.put(num, 1);
        }
        
        int maxOccurences = 0;
        int majorityElement = -1;
        for(int num : nums) {
            if(elementCounts.get(num) > maxOccurences) {
                majorityElement = num;
                maxOccurences = elementCounts.get(num);
            }
        }
        return majorityElement;
    }
}