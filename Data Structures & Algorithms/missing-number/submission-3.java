class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int right = n-1;
        if(nums[n-1]!=n){
            return n;
        }
        while(left<right){
            int mid = left + (right-left)/2;
            if(nums[mid]>mid){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}
