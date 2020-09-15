class Solution {
    public int findMinFibonacciNumbers(int k) {
        if(k == 0) return 0;
        int fib1 = 1, fib2 = 1;
        while(fib2 <= k) {
            int temp = fib2;
            fib2 += fib1;
            fib1 = temp;
        }
        if(fib2 == k) return 1;
        else return 1 + findMinFibonacciNumbers(k-fib1);
    }
}