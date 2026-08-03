class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        int tStart = 0;
        for(int i=0;i<n1;i++){
            char ch1 = s.charAt(i);
            boolean found = false;
            for(int j=tStart;j<n2;j++){
                char ch2 = t.charAt(j);
                if(ch1==ch2){
                    found = true;
                    tStart = j+1;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
}