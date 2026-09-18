class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int max = 0;
        int k = 0;
        int maxProfit = 0;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min = prices[i];
                k = i;
            }
            for(int j=k+1;j<n;j++){
                if(prices[i]>min){
                    max = prices[i]-min;
                }
            }
            maxProfit = Math.max(maxProfit, max);
        }
        return maxProfit;
    }
}