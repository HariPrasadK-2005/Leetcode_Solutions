class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int start=0;
        int end =nums.length;
        List<List<Integer>> l1 = new ArrayList<>();
        permutation(start,end,nums,new ArrayList<>(),l1);
        return l1;
    }
    public void permutation(int start,int end,int[] arr,List<Integer> temp, List<List<Integer>> l1){
        if(temp.size()==arr.length){
            l1.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<end;i++){
            if(temp.contains(arr[i])){
                continue;
            }
            temp.add(arr[i]);
            permutation(start+1,end,arr,temp,l1);
            temp.remove(temp.size()-1);
        }
        return;
    }
}