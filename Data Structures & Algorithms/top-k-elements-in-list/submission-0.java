

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort by frequency (descending), take top K, and convert to int[]
        return map.entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()) // Sort descending by count
            .limit(k)                                                         // Take only top K elements
            .mapToInt(Map.Entry::getKey)                                      // Extract the number (key)
            .toArray();                                                       // Convert to int[]
    }
}
