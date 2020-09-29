import java.util.List;
import java.util.ArrayList;

//Bottom up optimal fib solution

class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        //n = 3
        //0 1 1 2
        List<Integer> fibs = new ArrayList();
        fibs.add(0);
        fibs.add(1);
        for(int i=2; i<=n; i++) fibs.add(fibs.get(i-1) + fibs.get(i-2));
        return fibs.get(fibs.size()-1);
    }
}