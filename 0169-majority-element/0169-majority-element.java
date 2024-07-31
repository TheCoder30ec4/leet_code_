class Solution {
    public int majorityElement(int[] nums) {

        int temp = nums[0];
        int count =1;

        for(int i=1;i<nums.length;i++){
            if(temp == nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                temp = nums[i];
                count =1;
            }
        }

        return temp;

        
        
    }
}