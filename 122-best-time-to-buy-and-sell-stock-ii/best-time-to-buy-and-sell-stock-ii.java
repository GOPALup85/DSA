class Solution {
    public int maxProfit(int[] prices) {
        // int buy = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                max_profit += prices[i]-prices[i-1];
            }
            // int profit = prices[i]-buy;
            // while(prices[i]> buy){
            
            // // if(profit> max_profit){
            //     max_profit += profit;
            // }
        }
        return max_profit;
    }
}