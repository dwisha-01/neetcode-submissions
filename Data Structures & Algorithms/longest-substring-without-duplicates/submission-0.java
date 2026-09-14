class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int count = 0;
        int maxCount = 0;
        for(int i=0;i<n;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                if(set.contains(ch)){
                    break;
                }
                set.add(ch);
                maxCount = Math.max(maxCount, j-i+1);
            }
            
        }
        return maxCount;
    }
}
