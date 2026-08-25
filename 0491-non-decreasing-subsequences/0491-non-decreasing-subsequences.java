class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subsequences(nums, list, new ArrayList<>(), 0, Integer.MIN_VALUE);
        return list;
    }
    public void subsequences(int[] nums, List<List<Integer>> list, List<Integer> temp, int start, int num){
        if(temp.size()>1){
            list.add(new ArrayList<>(temp));
        }
        Set<Integer> set = new HashSet<>();
        for(int i=start; i<nums.length; i++){
            if(nums[i] < num) continue;
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);
            temp.add(nums[i]);
            subsequences(nums, list, temp, i+1, nums[i]);
            temp.remove(temp.size()-1);
        }
        return;
    }
}