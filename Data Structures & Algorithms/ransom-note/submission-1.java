class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n1 = ransomNote.length();
        int n2 = magazine.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0;i<n1;i++){
            char ch = ransomNote.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<n2;i++){
            char ch = magazine.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0)+1);
        }
        for(char ch:map1.keySet()){
            int needed = map1.get(ch);
            int available = map2.getOrDefault(ch, 0);
            if(available<needed){
                return false;
            }
        }
        return true;
    }
}