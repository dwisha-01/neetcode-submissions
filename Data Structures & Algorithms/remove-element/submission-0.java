class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        List<Integer> l1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(nums[i]);
        }
        while(l1.contains(val)){
           l1.remove(Integer.valueOf(val));
        }
        for(int i=0;i<l1.size();i++){
            nums[i] = l1.get(i);
        }
        return l1.size();

    }
}