class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int currentSum = nums[0];
        int maxSum = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                currentSum = currentSum + nums[i];
            }
            else if(nums[i]<=nums[i-1]){
                currentSum = nums[i];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}