class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] freq = new int[51];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
            max = Math.max(max,nums[i]);
        }
        if(k == nums.length){
            return max;
        }
        if(k == 1){
            for(int i=freq.length-1; i>=0; i--){
                if(freq[i] == 1) return i;
            }
        }
        else{
            if(nums[nums.length-1] > nums[0]){
                if(freq[nums[nums.length-1]] == 1) return nums[nums.length-1];
                else if(freq[nums[0]] == 1) return nums[0];
            }
            else{
                if(freq[nums[0]] == 1) return nums[0];
                else if(freq[nums[nums.length-1]] == 1) return nums[nums.length-1];
            }
        }
        return -1;
    }
}