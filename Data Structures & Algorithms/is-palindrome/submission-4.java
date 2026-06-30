class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                cleaned.append(Character.toLowerCase(c));
            }
        }
        String result = cleaned.toString();
        int n = result.length();
        int left = 0;
        int right = n-1;
        while(left<right){
            if(result.charAt(left)!=result.charAt(right)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
