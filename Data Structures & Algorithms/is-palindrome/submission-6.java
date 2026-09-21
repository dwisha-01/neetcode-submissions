class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c:s.toLowerCase().toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String result = sb.toString();
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
