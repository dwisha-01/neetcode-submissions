class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int right = n-1;
        int count = 0;
        while(right>=0 && s.charAt(right)==' '){
            right--;
        }
        while(right>=0 && s.charAt(right)!=' '){
            count++;
            right--;
        }
        return count;
    }
}