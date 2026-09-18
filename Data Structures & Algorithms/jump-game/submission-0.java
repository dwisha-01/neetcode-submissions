class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int i;
        int maxReach = 0;
        for(i=0;i<n;i++){
            if(i>maxReach){
                return false;
            }
            maxReach = Math.max(maxReach, i+nums[i]);
        }
        if(maxReach>=n-1){
           return true;
        }
        return false;
    }
}
