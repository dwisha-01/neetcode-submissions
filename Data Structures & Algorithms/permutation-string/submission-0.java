

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2) return false;

        // Step 1: Build the reference map for s1
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            char ch = s1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Extract every possible substring of length n1 from s2
        // The loop stops at (n2 - n1) so we don't run out of characters
        for (int i = 0; i <= n2 - n1; i++) {
            
            // Create a brand new map for the current substring
            HashMap<Character, Integer> currentSubStrMap = new HashMap<>();
            
            // Count characters in the current slice: from index 'i' to 'i + n1'
            for (int j = i; j < i + n1; j++) {
                char ch = s2.charAt(j);
                currentSubStrMap.put(ch, currentSubStrMap.getOrDefault(ch, 0) + 1);
            }

            // Step 3: Compare if this slice matches our pattern map exactly
            if (map1.equals(currentSubStrMap)) {
                return true; 
            }
        }

        return false;
    }
}
