class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        dict1 = {}
        
        for number in range(0, len(nums)):
            if nums[number] in dict1: 
                return [number, dict1[nums[number]]]
            else:
                dict1[target - nums[number]] = number