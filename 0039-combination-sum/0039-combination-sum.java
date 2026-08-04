class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        uniqueCombination(candidates,list,new ArrayList<>(),target,0);
        return list;
    }
    public void uniqueCombination( int[] arr, List<List<Integer>> list,List<Integer> temp,int target, int start){
        if(target==0){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(target<0){
            return;
        }
        for(int i = start;i<arr.length;i++){
            temp.add(arr[i]);
            uniqueCombination(arr,list,temp,target-arr[i],i);
            temp.remove(temp.size()-1);
        }
    }
}