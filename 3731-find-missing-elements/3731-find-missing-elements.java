class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        List<Integer> list = new ArrayList<>();
        for(int i=min;i<max;i++){
            boolean present=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    present=true;
                }
            }
            if(!present){
                list.add(i);
            }
        }
        return list;
    }
}