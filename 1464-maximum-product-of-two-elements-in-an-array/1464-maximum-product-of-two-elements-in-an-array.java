class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int num1 = 0;
        int num2 = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] * nums[j] > max){
                    max = nums[i] * nums[j];
                    num1 = nums[i];
                    num2 = nums[j]; 
                }
            }
        }
        return (num1 - 1) * (num2 - 1);
    }
}