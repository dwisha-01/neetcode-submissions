class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] ans = new int[n];
        suffix[n-1] = 1;
        prefix[0] = 1;
        for(int i=1;i<n;i++){
            int product = prefix[0];
            product = prefix[i-1]*nums[i-1];
            prefix[i] = product;
        }
        for(int i=n-2;i>=0;i--){
            int product = suffix[n-1];
            product = suffix[i+1]*nums[i+1];
            suffix[i] = product;
        }
        for(int i=0;i<n;i++){
            ans[i] = prefix[i]*suffix[i];
        }
        return ans;
    }
}  
