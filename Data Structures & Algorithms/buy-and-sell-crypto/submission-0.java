class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int currentProfit;
        
        for(int i = 0; i < prices.length; i ++){
            for(int k = i; k < prices.length; k++){

                currentProfit = prices[k] - prices[i];

                if(currentProfit > maxProfit){
                    maxProfit = currentProfit;
                }
            }
        }

        return maxProfit;
    }
}
