

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = func(n);
        }
        return n == 1;
    }
    
    public int func(int n){
        String number = String.valueOf(n);
        char[] digits = number.toCharArray();
        int sum = 0;
        int n1 = digits.length;
       
        for(int i = 0; i < n1; i++){
            
            int numericValue = digits[i] - '0'; 
            sum += (numericValue) * (numericValue); 
        }
       
        return sum;
    }
}
