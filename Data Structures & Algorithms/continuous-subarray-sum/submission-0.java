class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       int n = nums.length;
       for(int i=0;i<n;i++){
        int currentSum = nums[i];
        for(int j=i+1;j<n;j++){
            currentSum = currentSum +  nums[j];
            if(currentSum%k==0){
                return true;
            }
        }
       }
       return false; 
    }
}