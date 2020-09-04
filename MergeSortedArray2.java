class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int realIndex = 0;
        int nums1Index = 0;
        int nums2Index = 0;
        int[] nums1Copy = new int[m];
        boolean run = true;
        if(m == 0) {
            for(int i=0; i<n; i++) {
                nums1[i] = nums2[i];
            }
            run = false;
        } 
        if(n == 0) run = false;
        for(int i=0; i<m; i++) {
            nums1Copy[i] = nums1[i];
        }
        
        while(run && realIndex < m+n) {
            if(nums2Index >= n || nums1Index < m && nums1Copy[nums1Index] <= nums2[nums2Index]) {
                nums1[realIndex] = nums1Copy[nums1Index];
                nums1Index++;
            } else if(nums2Index < n) {
                nums1[realIndex] = nums2[nums2Index];
                nums2Index++;
            }
            realIndex++;
        }
    }
}