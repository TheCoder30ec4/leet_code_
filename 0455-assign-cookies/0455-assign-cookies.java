class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);


        int m = g.length;
        int n = s.length;
        int r=0, l=0;
        int count = 0;


        while(r<m && l<n){

            if(s[l] >= g[r]){
                count++;
                r++;
            }
            l++;
        }

        return count;

        
    }
}