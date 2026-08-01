class Solution {
    public boolean isAnagram(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        if(n1!=n2){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0;i<n1;i++){
            char ch = s.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
            
        }
        for(int i=0;i<n2;i++){
            char ch = t.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0)+1);
            
        }
        return map1.equals(map2);
    }
}
