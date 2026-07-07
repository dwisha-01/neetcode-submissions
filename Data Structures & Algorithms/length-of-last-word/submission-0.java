class Solution {
    public int lengthOfLastWord(String s) {
      int n = s.length();
        int left = 0;
        int right = n-1;
        while(right>=0 && s.charAt(right)==' '){
            right--;
        }
        while(right>=0 && s.charAt(right)!=' '){
            left++;
            right--;
        }
        return left;
    }
}