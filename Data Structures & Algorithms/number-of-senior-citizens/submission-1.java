class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        
        for (String detail : details) {
            // Extract and parse the age substring directly
            int age = (detail.charAt(11) - '0') * 10 + (detail.charAt(12) - '0');
            
            if (age > 60) {
                count++;
            }
        }
        
        return count;
    }
}
