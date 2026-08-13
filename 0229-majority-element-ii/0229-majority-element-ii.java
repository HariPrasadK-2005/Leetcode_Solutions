class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num) > nums.length/3){
                if(list.contains(num)) continue;
                else list.add(num);
            }
        }
        return list;
    }
}