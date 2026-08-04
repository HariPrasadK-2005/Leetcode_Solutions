class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        permutationTwo(nums, map, list, new ArrayList<>());
        return list;
    }
    public void permutationTwo(int[] arr, HashMap<Integer,Integer> map, List<List<Integer>> list, List<Integer> temp){
        if(temp.size() == arr.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i:map.keySet()){
            if(map.get(i)<=0){
                continue;
            }
            map.put(i,map.getOrDefault(i,0)-1);
            temp.add(i);
            permutationTwo(arr, map, list, temp);
            temp.remove(temp.size()-1);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return;
    }
}