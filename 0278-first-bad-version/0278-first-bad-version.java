/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (isBadVersion(1))
        return 1;
        long u=1;
        long l=n;
        while(u<=l){
            long m = u+(l-u)/2;
            //System.out.println(m);
            
            boolean b = isBadVersion((int)m);
            if (b && !isBadVersion((int)m-1))
            return (int)m;
            else if (b) 
            l = m-1;
            else 
            u = m+1;
        }
        return 0;
    }
}