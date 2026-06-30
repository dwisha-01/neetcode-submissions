class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder cleaned = new StringBuilder();
        for(char c: s.toCharArray()){
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        String orignal = cleaned.toString();
        String reversed = new StringBuilder(orignal).reverse().toString();
        return orignal.equals(reversed);
    }
}
