class Solution {
    public int appendCharacters(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        int tStart = 0;
        int count = 0;
        for(int i=0;i<n1;i++){
            char ch1 = s.charAt(i);
             if(tStart==n2){
                break;
             } 
            for(int j=tStart;j<n2;j++){
                char ch2 = t.charAt(j);
                if(ch1==ch2 && j==tStart){
                    count++;
                    tStart = j+1;
                    break;
                }
            }
        }
        return n2-count;
    }
}