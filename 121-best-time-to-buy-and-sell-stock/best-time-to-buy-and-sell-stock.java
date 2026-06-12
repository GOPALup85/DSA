class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int Max_profit = 0;
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if (buy>prices[i]){
                buy =prices[i];
            }
            profit = prices[i]-buy;
            while(profit>Max_profit){
                Max_profit = profit;
            }
        }
        return Max_profit;  
    }
}