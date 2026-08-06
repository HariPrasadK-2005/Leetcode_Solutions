class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = dynamicProgramming(n,dp);
        return ans;
    }
    public int dynamicProgramming(int n , int[] dp){
        if(n == 0 || n == 1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = dynamicProgramming(n-1, dp) + dynamicProgramming(n-2, dp);
        return dp[n];
    }
}