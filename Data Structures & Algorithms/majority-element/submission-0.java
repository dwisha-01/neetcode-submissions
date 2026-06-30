class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int a = 0;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }
            else{
                map.put(nums[i], 1);
            }
        } 
        for(int key : map.keySet()){
            if(map.get(key)>n/2){
                return key;
            }
        }
        return 0;
    }
}