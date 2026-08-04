class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        subsetTwo(nums,0,list,new ArrayList<>());
        return list;
    }
    public void subsetTwo(int[] arr, int start, List<List<Integer>> list, List<Integer> temp){
        list.add(new ArrayList<>(temp));
        for(int i=start;i<arr.length;i++){
            if(i>start && arr[i]==arr[i-1]){
                continue;
            }
            temp.add(arr[i]);
            subsetTwo(arr,i+1,list,temp);
            temp.remove(temp.size()-1);
        }
        return;
    }
}