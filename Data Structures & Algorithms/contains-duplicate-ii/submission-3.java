class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    int x = Math.abs(i-j);
                    if(x<=k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}