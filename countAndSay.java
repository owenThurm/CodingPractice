class Solution {
    public String countAndSay(int n) {
        /*
        is      read-as
        1       11
        11      21
        21      1211
        1211    111221
        111221  312211 
        
        return the nth 'is'
        
        read the n-1 'is'
        */
        
        return countAndSayAcc(n, 1, "1");
        
    }
    
    public String countAndSayAcc(int upTo, int cur, String acc) {
        
        //if cur = upto return the acc
        if(upTo == cur) return acc;
        //else 'read off' the string and return countAndSayAcc(same upTo, cur++, 'read-off' string)
        else {
            //read off the string
            String readOffNum = "";
            int consecutive = 1;
            char prev = acc.charAt(0);
            if(acc.length() == 1) return countAndSayAcc(upTo, cur+1, Integer.toString(consecutive) + Character.toString(prev));
            for(int i=1; i<acc.length(); i++) {
                if(acc.charAt(i) == prev) {
                    consecutive++;
                    if(i+1 == acc.length()) readOffNum += Integer.toString(consecutive) + Character.toString(prev);     
                }
                else{
                    readOffNum += Integer.toString(consecutive) + Character.toString(prev);
                    prev = acc.charAt(i);
                    consecutive = 1;
                    if(i+1 == acc.length()) readOffNum += Integer.toString(consecutive) + Character.toString(prev);
                }
            }
            return countAndSayAcc(upTo, cur+1, readOffNum);
        }
    }
}