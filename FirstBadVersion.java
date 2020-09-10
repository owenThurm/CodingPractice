/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n>1000000 && this.isBadVersion(n-1000000)) return firstBadVersion(n-1000000);
        else if(n>100000 && this.isBadVersion(n-100000)) return firstBadVersion(n-100000);
        else if(n>10000 && this.isBadVersion(n-10000)) return firstBadVersion(n-10000);
        else if(n>1000 && this.isBadVersion(n-1000)) return firstBadVersion(n-1000);
        else if(n>100 && this.isBadVersion(n-100)) return firstBadVersion(n-100);
        else if(n>10 && this.isBadVersion(n-10)) return firstBadVersion(n-10);
        else if(n>5 && this.isBadVersion(n-5)) return firstBadVersion(n-5);
        else if(isBadVersion(n)) return firstBadVersion(n-1);
        else return n+1;
    }
}