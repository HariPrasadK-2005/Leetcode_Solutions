class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        combinationSum(0,candidates,target,list,new ArrayList<>());
        return list;
    }
    public void combinationSum(int start, int[] arr, int target, List<List<Integer>> list, List<Integer> temp){
        if(target==0){
            // if(list.contains(temp)) return;
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<arr.length;i++){
            if(i>start && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            temp.add(arr[i]);
            combinationSum(i+1,arr,target-arr[i],list,temp);
            temp.remove(temp.size()-1);
        }
    }
}