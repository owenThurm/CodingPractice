class Solution {
    public int singleNumber(int[] nums) {
        //xor solution
      	int a = 0;
      	//0 xor num = num, num xor num = 0, num1 xor num2 = num3, num3 xor num2 = num1 
        for(int num : nums) a ^= num;
        return a;
    }
}