class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        return helper(n, memo);
    }
    private int helper(int step, int[] memo){
        if(step<=1){
            return 1;
        }
        if(memo[step]!=-1){
            return memo[step];
        }
        memo[step] = helper(step-1, memo) + helper(step-2, memo);
        return memo[step];
    }
}
