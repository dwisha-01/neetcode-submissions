class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        Arrays.sort(nums);
        int count = 1;
        int maxCount = 0;
        for(int i=1;i<n;i++){
            if(nums[i-1]+1==(nums[i])){
                count++;
            }
            else if((nums[i-1])!=nums[i]){
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}