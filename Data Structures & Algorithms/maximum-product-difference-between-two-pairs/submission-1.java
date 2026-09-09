class Solution {
    public int maxProductDifference(int[] nums) {
      int n = nums.length;
      Arrays.sort(nums);
      int a = nums[0]*nums[1];
      int b = nums[n-2]*nums[n-1];
      return b-a;  
    }
}