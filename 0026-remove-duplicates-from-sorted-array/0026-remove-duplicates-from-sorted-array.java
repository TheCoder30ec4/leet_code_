class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
        int count =1;
        for(int j=1;j<nums.length;j++){
            if(nums[i] != nums[j]){
                count ++;
                nums[++i] = nums[j];
                
            }
        }
        return count;
        
    }
}