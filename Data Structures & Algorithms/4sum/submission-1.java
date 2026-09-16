class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
            int left = j+1;
            int right = n-1;
            while(left<right){
                long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                if(sum==target){
                    List<Integer> quadruplets = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
                    if(!list.contains(quadruplets)){
                        list.add(quadruplets);
                    }
                    left++;
                    right--;
                }
                else if(sum>target){
                    right--;
                }
                else{
                    left++;
                }
            }
           }
        }
        return list;
    }
}