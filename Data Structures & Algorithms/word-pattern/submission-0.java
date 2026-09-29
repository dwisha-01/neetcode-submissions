class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n1 = pattern.length();
        String[] words = s.split(" ");
        int n2 = words.length;
        if(n1!=n2){
            return false;
        }
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        for(int i=0;i<n1;i++){
            char ch = pattern.charAt(i);
            if(map1.containsKey(ch) && !map1.get(ch).equals(words[i])){
                return false;
            }
            if(map2.containsKey(words[i]) && !map2.get(words[i]).equals(ch)){
                return false;
            }
            map1.put(ch, words[i]);
            map2.put(words[i], ch);
        }
        return true;
    }
}