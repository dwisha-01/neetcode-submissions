class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int currentSum = 0;
            for(int j=i;j<n;j++){
                currentSum = currentSum + nums[j];
                if(currentSum>=target){
                   minLength = Math.min(minLength, j-i+1);
                   break;
                }
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}