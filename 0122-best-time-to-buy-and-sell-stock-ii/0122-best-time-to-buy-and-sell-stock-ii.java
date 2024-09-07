class Solution {
    public int maxProfit(int[] prices) {

        // 7 1 5 3 6 
        
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }

        return profit;





        
        
    }
}