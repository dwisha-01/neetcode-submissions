

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectSet = new HashSet<>();
        
        // 1. Add all elements of nums1 to set1 to remove duplicates
        for (int num : nums1) {
            set1.add(num);
        }
        
        // 2. Check elements of nums2 against set1
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectSet.add(num); // Automatically handles duplicates in nums2
            }
        }
        
        // 3. Convert the intersection set into the required primitive int array
        int[] result = new int[intersectSet.size()];
        int index = 0;
        for (int num : intersectSet) {
            result[index++] = num;
        }
        
        return result;
    }
}
