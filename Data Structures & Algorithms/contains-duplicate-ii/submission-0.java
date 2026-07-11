class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int currentNum = nums[i];
            if(map.containsKey(currentNum) && (i-map.get(currentNum)<=k)){
                return true;
            }
            map.put(currentNum, i);
        }
        return false;
    }
}