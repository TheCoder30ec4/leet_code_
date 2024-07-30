class Solution {
    public int maxProduct(int[] nums) {

       double leftProduct =1;
       double rightProduct =1;
       double ans = nums[0];


       for(int i=0;i<nums.length;i++){

        if(leftProduct ==0){
            leftProduct =1;
        }
        if(rightProduct == 0){
            rightProduct =1;
        }

        leftProduct *=nums[i];
        rightProduct *= nums[nums.length-1-i];

        ans = Math.max(ans,Math.max(leftProduct,rightProduct));

       }

       return  (int) ans;
    }
}