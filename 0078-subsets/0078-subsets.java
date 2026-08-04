class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subset(nums,list,0,new ArrayList<>());
        return list;
    }
    public void subset(int[] arr, List<List<Integer>> list, int start, List<Integer> temp){
        list.add(new ArrayList<>(temp));
        for(int i=start;i<arr.length;i++){
            temp.add(arr[i]);
            subset(arr,list,i+1,temp);
            temp.remove(temp.size()-1);
        }
        return;
    }
}