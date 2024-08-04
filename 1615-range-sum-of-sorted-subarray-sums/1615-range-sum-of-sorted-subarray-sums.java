class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {


        long [] res = new long [n*(n+1)/2];
        long totalSum =0;
        int z =0;
        int mod = 1_000_000_007;


        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                res[z] = sum;
                z++;
            }
        }

        Arrays.sort(res);

        for(int i= left-1;i<right;i++){

            totalSum += res[i];

        }

        return (int)(totalSum%mod);



    }
}