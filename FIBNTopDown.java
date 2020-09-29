import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

//optimal top down recursive solution

class Solution {
    List<Integer> fibs = new ArrayList(Arrays.asList(0, 1));
    
    public int fib(int n) {
        if(n == 0) return 0;
        else if(n == 1) return 1;
        //if fib of n is already calculated and stored in fibs return that fib
        else if(n < fibs.size()) return fibs.get(n);
        //else calculate fib of n based on a recursive call to fib of n-1 and n-2
        else {
            //calculate the next fib value and add it to fibs
            int curFib = fib(n-1) + fib(n-2);
            fibs.add(curFib);
            //return the fib value
            return curFib;
        }
    }
}