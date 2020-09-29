class Solution {
    public int[] plusOne(int[] digits) {
        int digitPointer = digits.length-1;
        while(digits[digitPointer] == 9) {
            //set the digit at the current pointer to 0
            digits[digitPointer] = 0;
            //move the digit pointer immediately to the left
            if(digitPointer == 0) {
                int[] copy = digits;
                digits = new int[digits.length+1];
                digits[0] = 0;
                for(int i=1; i<=copy.length; i++) digits[i] = copy[i-1];
            } else {
                digitPointer--;
            }
            //and then the digit at the digitPointer will get one added to it
            
            //if this is the first digit in the number -- add a 0 to the beginning of the array
            
        }
        digits[digitPointer]+=1;
        return digits;
    }
}