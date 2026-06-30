class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> a = new HashMap<>();
        HashMap<Character, Integer> b = new HashMap<>();
        int n1 = s.length();
        int n2 = t.length();
        if(n1!=n2){
            return false;
        }
        for(int i=0;i<n1;i++){
            char ch = s.charAt(i);
            a.put(ch, a.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<n2;i++){
            char ch = t.charAt(i);
            b.put(ch, b.getOrDefault(ch, 0)+1);
        }
        return a.equals(b);
    }
}
