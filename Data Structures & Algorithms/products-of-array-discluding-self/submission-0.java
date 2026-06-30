class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            int currentProduct = 1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    currentProduct = currentProduct*nums[j];
                }
            }
            result[i] = currentProduct;
        }
        return result;
    }
}  
