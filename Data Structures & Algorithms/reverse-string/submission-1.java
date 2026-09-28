class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int left = 0;
        int right = n-1;
        while(left<right){
           char c = s[left];
           s[left] = s[right];
           s[right] = c; 
           left++;
           right--;
        }
        
    }
}