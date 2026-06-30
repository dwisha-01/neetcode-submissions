class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longestStreak = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                 while(set.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);

            }
           
        }
        return longestStreak;
    }
}
