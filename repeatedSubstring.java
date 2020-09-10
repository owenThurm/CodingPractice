class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String sub = "";
        int subPointer = 0;
        while(sub.length() <= s.length()/2) {
            sub+= Character.toString(s.charAt(subPointer));
            for(int i=0; i<=s.length()-sub.length(); i+= sub.length()) {
                if(!s.substring(i, i+sub.length()).equals(sub)) {
                   break; 
                } 
                if(i!=0 && i==s.length()-sub.length()) return true;
            }
            subPointer++;
        }
        return false;
    }
}