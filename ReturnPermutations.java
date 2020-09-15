class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0) return new ArrayList(Arrays.asList(new ArrayList()));
        if(nums.length == 1) return new ArrayList(Arrays.asList(new ArrayList(Arrays.asList(nums[0]))));
        if(nums.length == 2) return new ArrayList(Arrays.asList(new ArrayList(Arrays.asList(nums[0], nums[1])), new ArrayList(Arrays.asList(nums[1], nums[0]))));
        List<List<Integer>> permutations = new ArrayList();
        for(int num : nums) {
            //get all of the permutations of the rest of the list and add this num to the beginning
            for(int i=0; i<nums.length; i++) System.out.print(nums[i]);
            System.out.println();
            List<List<Integer>> restPerms = permute(this.remove(nums, num));
            for(int i=0; i<this.remove(nums, num).length; i++) System.out.print(this.remove(nums, num)[i]);
            System.out.println();
            for(List<Integer> perm : restPerms) {
                perm.add(0, num);
            }
            //add those permutations to the list of permutations
            permutations.addAll(restPerms);
        }
        return permutations;
    }
    
    public int[] remove(int[] nums, int num) {
        int[] removed = new int[nums.length-1];
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != num) {
                removed[j] = nums[i];
                j++;
            }
        }
        return removed;
    }
}