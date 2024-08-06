class Solution {
    public int minimumPushes(String word) {

        int n = word.length();
        int ans = 0;
        while(n > 0){
            ans +=n;
            n -=8;

        }



        return ans;
    }
}