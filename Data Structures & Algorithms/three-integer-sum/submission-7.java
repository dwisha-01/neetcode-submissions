class Solution { 
    public List<List<Integer>> threeSum(int[] nums) { 
        int n = nums.length; 
        Arrays.sort(nums); 
        List<List<Integer>> list = new ArrayList<>(); 

        for(int i = 0; i < n - 2; i++) { 

            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int left = i + 1; 
            int right = n - 1; 

            while(left < right) { 

                if(nums[left] + nums[right] > -nums[i]) { 
                    right--; 
                } 
                else if(nums[left] + nums[right] < -nums[i]) { 
                    left++; 
                } 
                else { 
                    List<Integer> triplet = Arrays.asList(
                        nums[i], nums[left], nums[right]
                    );

                    list.add(triplet);

                    int leftValue = nums[left];
                    int rightValue = nums[right];

                    while(left < right && nums[left] == leftValue) {
                        left++;
                    }

                    while(left < right && nums[right] == rightValue) {
                        right--;
                    }
                } 
            } 
        } 

        return list; 
    } 
}