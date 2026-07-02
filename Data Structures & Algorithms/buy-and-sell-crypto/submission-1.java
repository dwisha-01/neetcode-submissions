class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int maxProfit = 0;
        for(int price:prices){
            int currentProfit = price-min;
            if(min>price){
                min = price;
            }
            if(maxProfit<currentProfit){
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}
