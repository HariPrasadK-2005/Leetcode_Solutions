class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        backtrack(0,0,nums,target);
        return count;
    }
    int count=0;
    public void backtrack(int start, int sum, int[] nums, int target){
        if(start==nums.length)
        {
            if(sum==target){
                count++;
            }
            return;
        }
        backtrack(start+1, sum+nums[start], nums, target);
        backtrack(start+1, sum-nums[start], nums, target);
    }
}