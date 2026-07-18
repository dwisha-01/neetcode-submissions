class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        
        for(int i=0;i<n;i++){
            if(nums[i]==k){
                return 0;
            }
        }
        for(int i=0;i<n;i++){
            int currentProduct = 1;
            
            for(int j=i;j<n;j++){
                currentProduct = currentProduct*nums[j];
                if(currentProduct<k){
                    count++;

                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}