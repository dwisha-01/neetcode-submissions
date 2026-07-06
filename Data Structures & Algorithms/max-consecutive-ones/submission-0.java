class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int streak = 0;
        List<Integer> result = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                streak++;
                result.add(streak);
            }
            else if(nums[i]==0){
                streak = 0;
                result.add(streak);
            }
        }
        return Collections.max(result);
    }
}