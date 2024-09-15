class Solution {
    public int longestSubarray(int[] nums) {

        int maxi= 0;

        for(int i: nums){
            maxi = Math.max(maxi,i);
        }

        int longest=0;
        int currentlongest =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == maxi){
                currentlongest++;
                longest = Math.max(currentlongest,longest);
            }
            else{
                currentlongest =0;
            }
        }

        return longest;
    }
}