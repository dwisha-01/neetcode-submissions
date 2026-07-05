class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Arrays.sort(strs);
        List<List<String>> result = new ArrayList<>();
        int n = strs.length;
        if(strs==null || n==0){
            return result;
        }
        //to track strings who are already groupped in lists
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            List<String> currentGroup = new ArrayList<>();
            currentGroup.add(strs[i]);
            visited[i] = true;
            for(int j=i+1;j<n;j++){
                if(!visited[j] && isAnagram(strs[i], strs[j])){
                    currentGroup.add(strs[j]);
                    visited[j] = true;
                }
            }
            result.add(currentGroup);
        }
        return result;
    }
    private boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }
}
