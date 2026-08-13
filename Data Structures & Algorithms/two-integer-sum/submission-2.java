class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int difference = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            difference = target-nums[i];
            if(map.containsKey(difference)){
                return new int[]{map.get(difference), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
