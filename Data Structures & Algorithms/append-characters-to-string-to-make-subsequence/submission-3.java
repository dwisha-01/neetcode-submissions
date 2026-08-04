class Solution {
    public int appendCharacters(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        int i = 0;
        int j = 0;
        int count = 0;
        while(i<n1 && j<n2){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(j);
            if(ch1==ch2){
                count++;
                j++;
            }
            i++;
        }
        return n2-count;
    }
}