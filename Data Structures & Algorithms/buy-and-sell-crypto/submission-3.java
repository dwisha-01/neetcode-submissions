class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        List<Integer> list = new ArrayList<>();
        int a = 0;
        for(int i=0;i<n;i++){
            a = prices[i];
            for(int j=i+1;j<n;j++){
                if(prices[j]>a){
                    list.add(prices[j]-a);
                }
            }
        }
        if(list.isEmpty()){
            return 0;
        }
        int max = Collections.max(list);
        return max;
    }
}
