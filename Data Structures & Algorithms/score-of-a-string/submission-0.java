class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int a = 0;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            int ascii = (int)s.charAt(i);
            result[i] = ascii;
        }
        for(int i=0;i<n-1;i++){
            a += Math.abs(result[i+1]-result[i]);
        }
        return a;
    }
}